import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class Client {
    private static final int PKT_HELLO = 0;
    private static final int PKT_CALC = 1;
    private static final int PKT_RESULT = 2;
    private static final int PKT_BYE = 3;
    private static final int PKT_FLAG = 4;

    private static void sendPacket(Socket socket, int packetType, byte[] data) throws IOException {
        int packetLen = data.length;
        byte[] packetTypeBytes = ByteBuffer.allocate(4).order(java.nio.ByteOrder.LITTLE_ENDIAN).putInt(packetType).array();
        byte[] packetLenBytes = ByteBuffer.allocate(4).order(java.nio.ByteOrder.LITTLE_ENDIAN).putInt(packetLen).array();

        DataOutputStream out = new DataOutputStream(socket.getOutputStream());
        out.write(packetTypeBytes);
        out.write(packetLenBytes);
        out.write(data);
        out.flush();
    }

    private static Object[] receivePacket(Socket socket) throws IOException {
        byte[] header = new byte[8];
        DataInputStream inputStream = new DataInputStream(socket.getInputStream());
        inputStream.readFully(header);

        ByteBuffer bb = ByteBuffer.wrap(header).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        int packetType = bb.getInt();
        int packetLen = bb.getInt();

        byte[] data = new byte[packetLen];
        inputStream.readFully(data);

        System.out.println("Header received: " + (header));
        System.out.println("Packet received length: " + packetLen);

        return new Object[]{packetType, data};
    }

    public static void main(String[] args) {
        String serverAddress = "112.137.129.129";
        int serverPort = 27001;

        try {
            Socket socket = new Socket(serverAddress, serverPort);
            System.out.println("Starting the client...");
            System.out.println("Connected to the server.");

            String studentId = "21020456";
            sendPacket(socket, PKT_HELLO, studentId.getBytes(StandardCharsets.UTF_8));
            System.out.println("Sent PKT_HELLO packet.");

            int packetType;
            byte[] data;
            while (true) {
                Object[] receivedPacket = receivePacket(socket);
                packetType = (int) receivedPacket[0];
                data = (byte[]) receivedPacket[1];

                System.out.println("\nReceived packet type: " + packetType);
                if (packetType == PKT_CALC) {
                    int a = ByteBuffer.wrap(data, 0, 4).order(java.nio.ByteOrder.LITTLE_ENDIAN).getInt();
                    int b = ByteBuffer.wrap(data, 4, 4).order(java.nio.ByteOrder.LITTLE_ENDIAN).getInt();
                    System.out.println("Received a = " + a + " and b = " + b);

                    // Calculate the sum of a and b
                    int result = a + b;
                    byte[] resultBytes = ByteBuffer.allocate(4).order(java.nio.ByteOrder.LITTLE_ENDIAN).putInt(result).array();

                    // Sending the result back to the server
                    sendPacket(socket, PKT_RESULT, resultBytes);
                    System.out.println("Sent PKT_RESULT packet with the sum: " + result);
                } else if (packetType == PKT_FLAG) {
                    String flag = new String(data, StandardCharsets.UTF_8);
                    System.out.println("Received PKT_FLAG packet with flag: " + flag);
                    break;
                } else {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
