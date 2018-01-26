package les_09.ex_1;

public class SimUnit {
    String botType;
    SimUnit(String type){
        botType = type;
        System.out.println("SimUnit was created type " + botType);
    }
    int powerUse(){
        if("Тепловая машина".equals(botType)){
            return 2;
        }else{
            return 4;
        }
    }
}
