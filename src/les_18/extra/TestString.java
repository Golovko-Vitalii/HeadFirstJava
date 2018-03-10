package les_18.extra;

import les_10.S;

public class TestString {
    public static void main(String[]args){
        String s = "0";
        for (int i = 1; i < 10; i++) {
            s = s + i;//each time create new string obj into String poll
        }
        Integer iWrap = new Integer(42);
        iWrap = 23; //23 is new obj
        System.out.println(iWrap);
        //iWrap = 0;
        //assert java -ea TestString
        assert(iWrap>0): "iWrap = " + iWrap;
        if(iWrap>0){
            System.out.println("programm message");
        }
    }
}
