package les_15.test_socket;

import java.io.PrintWriter;
import java.net.Socket;

public class TestSocketOutput {
    public static void main(String[] args){
        try{
            Socket chatSocket = new Socket("127.0.0.1", 5000);
            PrintWriter writer = new PrintWriter(chatSocket.getOutputStream());
            writer.println("Message for sending");
            writer.print("Another message");
        }catch(Exception ex){ex.printStackTrace();}
    }
}
