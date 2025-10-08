import java.net.*;
import java.io.*;


public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            InetAddress clientAddress = InetAddress.getByName("0.0.0.0");
            SocketAddress clientSocketAddress = new InetSocketAddress(clientAddress, 8080);

            serverSocket = new ServerSocket();
            serverSocket.bind(clientSocketAddress);

            Socket clientSocket = serverSocket.accept();
            System.out.println("Connected to client: " + clientSocket);

        } catch (IOException ioe) {
            System.out.println("IOException " + ioe.getMessage());
        } finally {
            if (serverSocket != null) {
                serverSocket.close();
            }
        }
    }
}