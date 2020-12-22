
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.channels.SocketChannel;

public class startSocket {

    public static void main(String[] args){
        try {
            Socket socket = new Socket("192.168.0.105", 8052);
            OutputStream out = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(out);

            writer.write("weater on");
            //Flushing the Writer to actually send the Data
            writer.flush();

            writer.close();
            socket.close();

        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
