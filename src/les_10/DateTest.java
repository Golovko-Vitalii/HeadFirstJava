package les_10;

import java.util.Date;

public class DateTest {
    public static void main(String[] args){
        System.out.println(String.format("%tc", new Date()));
        System.out.println(String.format("%tr", new Date()));
        Date today = new Date();
        System.out.println(String.format("time1 = %tr, Day = %tA, Month = %tB, Date = %td, time2 = %tr", today,today,today,today,today));
        System.out.println(String.format("%tr", today));
        for (int i = 0; i < 9; i++) {

            System.out.println(String.format("%tr", today));
        }
        System.out.println(String.format("time1 = %tr, Day = %<tA, Month = %<tB, Date = %<td, time2 = %<tr", today));
    }
}
