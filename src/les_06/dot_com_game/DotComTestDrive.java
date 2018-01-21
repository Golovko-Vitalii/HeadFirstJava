package les_06.dot_com_game;

import java.util.ArrayList;

public class DotComTestDrive {
    public static void main(String[] args) {
        DotCom dot = new DotCom();
        GameHelper gh = new GameHelper();
        ArrayList<String> locations = new ArrayList<String>();
        locations = gh.placeDotCom(3);
        dot.setLocationCells(locations);
        String [] userGuesses = {"A0","A3","A5","B0","b3","b5","c0","c3","c5","d0","d3","d5","e0","e3","e5","f0","f3","f5","g0","g3","G5"};
        String testResult = "TestDrive - Неудача";
        for (String userGuess : userGuesses){
            String result = dot.checkYourself(userGuess);
            if (result.equals("Попал")){
                testResult = "TestDrive " + userGuess + " - Пройден";
                break;
            }
        }
        System.out.println(testResult);

    }
}
