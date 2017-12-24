package les_05.simple_dot_com_game;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int [] locations = {2,3,4};
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "TestDrive - Неудача";
        if (result.equals("Попал")){
            testResult = "TestDrive - Пройден";
        }
        System.out.println(testResult);
    }
}
