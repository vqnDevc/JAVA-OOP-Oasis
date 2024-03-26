
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("112.137.129.129", 27001);
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF("send");
            socket.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
