package les_10;

import java.util.Calendar;

public class CalendarTest {
    public static void main(String[] args){
        //Calendar cal = new Calendar();
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        c.set(2004,0,7,15,40);
        long day1 = c.getTimeInMillis();
        System.out.println(c.getTime());
        System.out.println(day1);
        day1 += 1000*60*60;
        c.setTimeInMillis(day1);
        System.out.println(c.getTime());
        System.out.println(c.getTimeInMillis());
        System.out.println("New hour" + c.get(c.HOUR_OF_DAY));
        c.add(c.DATE, 35);
        System.out.println("Add 35 days = " + c.getTime());
        c.roll(c.DATE, 35);
        System.out.println("Roll 35 days = " + c.getTime());
        c.set(c.DATE, 1);
        System.out.println("Set date 1 = " + c.getTime());
    }
}
