package les_10;

public class Foof {
    final int size = 3;
    final int whuffie;
    Foof(){
        whuffie = 42;
    }
    void doStuff(final int x){
        //u can't change x
        System.out.println("x = " + x);
        //x = 4;
    }
    void doMore(){
        final int z;
        z = 7;
        //u can't change z
        System.out.println("z = " + z);
        //z = 4;
    }

    public static void main(String[] args){
        Foof f1 = new Foof();
        System.out.println(f1.size);
        System.out.println(f1.whuffie);
        //f1.size = 4;
        //f1.whuffie = 4;
        f1.doStuff(11);
        f1.doMore();
    }
}
