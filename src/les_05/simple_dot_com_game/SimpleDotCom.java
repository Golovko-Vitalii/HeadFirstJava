package les_05.simple_dot_com_game;

public class SimpleDotCom {
    int [] locationCells;
    int numOfHits;
    public void setLocationCells (int [] locs){
        locationCells = locs;
    }
    public String checkYourself (String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell : locationCells){
            if (guess == cell){
                result = "Попал";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length){
            result = "Потопил";
        }
        System.out.println(result);
        return result;
    }
}
