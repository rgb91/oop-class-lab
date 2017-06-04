package socket;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by sanjaysaha on 1/4/17.
 */

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(1971);
        Socket s = server.accept();

        // complete the code
    }
}

class Client {
    public static void main(String[] args) {
//        Socket client = new Socket("localhost", 1971);

        // complete the code
    }
}