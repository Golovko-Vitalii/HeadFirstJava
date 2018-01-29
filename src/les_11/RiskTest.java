package les_11;

import com.sun.javaws.exceptions.BadFieldException;

import java.io.IOException;

public class RiskTest {
    boolean abandonAllHope;
    public void takeRisk() throws BadFieldException{
        if(!abandonAllHope){
            throw new BadFieldException("","","");
        }
    }
    public void riskRuntime(){
        throw new NullPointerException();
    }
    public void crossFingers(){
        try{
            new RiskTest().takeRisk();
        } catch(BadFieldException ex){
            System.out.println("Oh!");
            ex.printStackTrace();
        }
        new RiskTest().riskRuntime();
    }
    public static void main(String[] args){
        new RiskTest().crossFingers();
    }
}
