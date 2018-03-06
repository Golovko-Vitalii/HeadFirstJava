package les_15.daily_advise;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class DailyAdviseClient {
    public void go(){
        try {
            Socket s = new Socket("127.0.0.1", 4242);
            InputStreamReader isr = new InputStreamReader(s.getInputStream());
            BufferedReader reader = new BufferedReader(isr);
            String advice = reader.readLine();
            System.out.println("Received advice: " + advice);
            reader.close();
        }catch(Exception ex){ex.printStackTrace();}
    }
    public static void main(String[] args){
        DailyAdviseClient dac = new DailyAdviseClient();
        dac.go();
    }
}
