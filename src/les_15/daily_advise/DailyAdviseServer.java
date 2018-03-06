package les_15.daily_advise;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class DailyAdviseServer {
    String[] adviseList = {"Ешьте меньшими порциями","Купите облегающие джинсы. Нет, они не " +
            "делают Вас полнее.","Два слова: не годится","Будьте честны хотябы сегодня. " +
            "Скажите своему начальнику все, что Вы *на самом деле* о нем думаете.",
            "Возможно, Вам стоит подобрать другую прическу."};
    public static void main(String[] args){
        DailyAdviseServer das = new DailyAdviseServer();
        das.go();
    }
    public void go(){
        try{
            ServerSocket serverSocket = new ServerSocket(4242);
            while(true){
                Socket socket = serverSocket.accept();
                PrintWriter writer = new PrintWriter(socket.getOutputStream());
                String advise = getAdvise();
                writer.println(advise);
                writer.close();
                System.out.println(advise);
            }
        }catch(Exception ex){ex.printStackTrace();}
    }
    private String getAdvise(){
        int random = (int)(Math.random()*adviseList.length);
        return adviseList[random];
    }
}
