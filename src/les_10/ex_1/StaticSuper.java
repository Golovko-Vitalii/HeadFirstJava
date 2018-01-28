package les_10.ex_1;

public class StaticSuper {
    static{
        System.out.println("Patents static block");
    }
    StaticSuper(){
        System.out.println("Parents constructor");
    }
}
