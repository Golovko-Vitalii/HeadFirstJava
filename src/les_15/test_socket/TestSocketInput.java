package les_15.test_socket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class TestSocketInput {
    public static void main(String[] args){
        try {
            Socket chatSocket = new Socket("127.0.0.1", 5000);
            InputStreamReader isr = new InputStreamReader(chatSocket.getInputStream());
            BufferedReader reader = new BufferedReader(isr);
            String message = reader.readLine();
        }catch(Exception ex){ex.printStackTrace();}
    }
}
