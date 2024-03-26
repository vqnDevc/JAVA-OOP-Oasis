package networking;

import java.io.*;
import java.net.*;

public class TCPClient {
    private static final int PORT = 27001;
    private static final int BUFFER_SIZE = 1024;

    // Define packet types
    private static final int PKT_HELLO = 0;
    private static final int PKT_CALC = 1;
    private static final int PKT_RESULT = 2;
    private static final int PKT_BYE = 3;
    private static final int PKT_FLAG = 4;

    // Function to send a packet
    private static void sendPacket(DataOutputStream out, int type, int len, byte[] data) throws IOException {
        // Send packet type
        out.writeInt(type);
        // Send packet length
        out.writeInt(len);
        // Send packet data
        if (data != null) {
            out.write(data, 0, len);
        }
        out.flush();
    }

    public static void main(String[] args) {
        Socket socket = null;
        DataInputStream in = null;
        DataOutputStream out = null;

        try {
            // Create socket
            socket = new Socket("112.137.129.129", PORT);

            // Get input and output streams
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            // Send PKT_HELLO packet with student ID
            String studentId = "21020452";
            sendPacket(out, PKT_HELLO, studentId.length(), studentId.getBytes());

            // Read packets from server
            while (true) {
                int type = in.readInt();
                int len = in.readInt();
                byte[] buffer = new byte[len];
                in.readFully(buffer);
                    
                if (type != PKT_CALC || len != 8) {
                    System.out.println("End PKT_CALC, next PKT=" + type);
                    break;
                }

                // Extract numbers a and b from PKT_CALC packet
                DataInputStream dis = new DataInputStream(new ByteArrayInputStream(buffer));
                int a = dis.readInt();
                int b = dis.readInt();

                // Calculate result
                int result = a + b;

                // Send PKT_RESULT packet with result
                ByteArrayOutputStream baos = new ByteArrayOutputStream();
                DataOutputStream dos = new DataOutputStream(baos);
                dos.writeInt(result);
                sendPacket(out, PKT_RESULT, Integer.BYTES, baos.toByteArray());
            }

            // Receive PKT_FLAG packet from server
            int flagType = in.readInt();
            int flagLen = in.readInt();
            byte[] flagData = new byte[flagLen];
            in.readFully(flagData);

            // Parse PKT_FLAG packet
            if (flagType != PKT_FLAG) {
                System.out.println("Error: Unexpected packet type");
                return;
            }

            // Print flag
            String flag = new String(flagData);
            System.out.println("Flag: " + flag);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
