import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        System.out.println("Server is running...");
        try {
            ServerSocket server = new ServerSocket(12345);
            Socket socket = server.accept();
            DataInputStream in = new DataInputStream(socket.getInputStream());
            if (in.readUTF().equals("send")) {
                System.out.println("Received.");
            }
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
