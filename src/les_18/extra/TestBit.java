package les_18.extra;

public class TestBit {
    public static void main(String[]args){
        int x = 10;//00001010
        System.out.println(x);
        x = ~x;//11110101 = -11
        System.out.println(x);
        x = 10;//00001010
        int y = 6;//00000110
        //& bit "logic and" 0&0=0;0&1=0;1&0=0;1&1=1;
        int a = x&y;// 00000010 = 2;
        System.out.println(a);
        // | "logic or" 0|0=0;0|1=1;1|0=1;1|1=1;
        a = x|y;//00001110 = 14;
        System.out.println(a);
        // | "logic xor" 0^0=0;0^1=1;1^0=1;1^1=0;
        a = x^y;//00001100 = 12;
        System.out.println(a);
        x = -1;//(sign bit negative)1 (31 bit number)111 111 111 111 111 111 111 111 111 111 1
        // >>>1 move one bit to the right with sign bit and change new bit to 0
        int z = x>>>1;//(sign bit changed to positive)0 (31 bit)111 111 111 111 111 111 111 111 111 111 1
        // = 2 in the power of 30 + 5 power 29 +...+ 2 power 1 + 2 power 0 =
        int z1 =0;for(int i =0;i<=30;i++){z1+=Math.pow(2,i);}
        System.out.println(z1);
        // z = 2147483647
        System.out.println(z);
        x = -2;//(sign bit negative)1 (31 bit number)111 111 111 111 111 111 111 111 111 111 0
        z = x>>>1;//(sign bit changed to positive)0 (31 bit)111 111 111 111 111 111 111 111 111 111 1
        // = 2 in the power of 30 + 5 power 29 +...+ 2 power 1 + 2 power 0; z = 2147483647
        System.out.println(z);
        x = -2;//(sign bit negative)1 (31 bit number)111 111 111 111 111 111 111 111 111 111 0
        z = x>>>31;//(sign bit changed to positive)0 (31 bit)000 000 000 000 000 000 000 000 000 000 1
        // = 2 in the power of 0;  z = 1
        System.out.println(z);
        //>>1 move one bit to the right without sign bit and change new bit to the sign bit
        x = -1;//(sign bit negative)1 (31 bit number)111 111 111 111 111 111 111 111 111 111 1
        z = x>>1;//(sign bit NOT changed)1 (31 bit)111 111 111 111 111 111 111 111 111 111 1
        //z = -1
        System.out.println(z);
        x = 3;////(sign bit positive)0 (31 bit number)000 000 000 000 000 000 000 000 000 001 1
        z = x>>1;//(sign bit NOT changed)0 (31 bit) (change to sign bit  = 0)"0"00 000 000 000 000 000 000 000 000 000 1; z = 1
        System.out.println(z);
        //<<1 move one bit to the left and sign bit can be changed, new bit = 0
        x = 2147483647;//(sign bit is positive)0 (31 bit)111 111 111 111 111 111 111 111 111 111 1
        z = x<<1;//(sign bit changed to negative)1 (31 bit)111 111 111 111 111 111 111 111 111 111 "0"(new bit = 0); z = -2
        System.out.println(z);
    }
}
