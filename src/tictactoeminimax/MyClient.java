package tictactoeminimax;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class MyClient {

    Socket socket;

    {
        try {
            socket = new Socket("localhost", 6666);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF("hello server");
            dataOutputStream.flush();
            dataOutputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
