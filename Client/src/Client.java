import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = null;
        try {
            InetAddress localhost = InetAddress.getByName("localhost");
            InetSocketAddress inetSocketAddress = new InetSocketAddress(localhost, 8080);

            socket = new Socket();
            socket.connect(inetSocketAddress);

            //Client info
            System.out.println("Client info " + socket);
        } catch (IOException ioe) {
            System.out.println("IOException: " + ioe.getMessage());
        } finally {
            if (socket != null) {
                socket.close();
            }
        }
    }
}