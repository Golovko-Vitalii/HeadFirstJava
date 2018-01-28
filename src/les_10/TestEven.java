package les_10;

import java.util.ArrayList;

public class TestEven {
    public static void main(String[] args){
        String [] a = {"asdf", "2.3", "3,4", "3", "4", "dasf", "6", "0.33", "-4"};
        ArrayList<Integer> even = new ArrayList<Integer>();
        for(int i = 0; i<a.length; i++){
            try{
                double d = Double.parseDouble(a[i]);
                if((d/2-Math.floor(d/2))==0){
                    even.add(Integer.parseInt(a[i]));
                }
            } catch (Exception e){
                //nothing
            }
        }
        for(int i: even){
            System.out.println(i);
        }
    }
}
