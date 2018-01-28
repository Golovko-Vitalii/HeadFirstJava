package les_10.ex_2;

import java.util.Calendar;

import static java.lang.System.out;
public class FullMoons {
    static int DAY_IM = 1000*60*60*24;

    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        c.set(2004,0,7,17,41);
        long day1 = c.getTimeInMillis();
        while(c.getTimeInMillis()<=Calendar.getInstance().getTimeInMillis()-DAY_IM*29.52){
            day1 += (DAY_IM*29.52);
            c.setTimeInMillis(day1);
            out.println(String.format("Fool moon in Kyiv was on %tc ", c));
        }
    }
}
