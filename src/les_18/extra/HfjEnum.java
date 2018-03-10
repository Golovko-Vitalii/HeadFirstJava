package les_18.extra;

public class HfjEnum {
    enum Names{
        JERRY("solo-guitar"){public String sings() {
                return "sadly";}
        },
        BOBBY("rhythm-guitar"){public String sings() {
                return "rude";
            }
        },
        PHIL("bass-guitar");
        private String instrument;
        Names(String instrument){
            this.instrument = instrument;
        }

        public String getInstrument() {
            return this.instrument;
        }
        public String sings(){
            return "seldom";
        }
    }
    public static void main(String[]args){
        for (Names n:Names.values()){
            System.out.print(n);
            System.out.print(", instrument: "+n.getInstrument());
            System.out.println(", sounds: "+n.sings());
        }
    }
}
