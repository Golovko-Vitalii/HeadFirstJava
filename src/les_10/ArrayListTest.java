package les_10;

import java.util.ArrayList;

public class ArrayListTest {
    public void doNumsOldWay(){
        ArrayList listOfNumbers = new ArrayList();
        listOfNumbers.add(new Integer(3));
        Integer one = (Integer)listOfNumbers.get(0);
        int intOne = one.intValue();
    }
    public void doNumsNewWay(){
        ArrayList<Integer> listOfNumbers = new ArrayList<Integer>();
        listOfNumbers.add(3);
        int num = listOfNumbers.get(0);
    }
}
