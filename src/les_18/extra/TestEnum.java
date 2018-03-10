package les_18.extra;

public class TestEnum {
    //before Java 5.0
    class Old{
        public static final int JERRY = 1;
        public static final int BOBBY = 2;
        public static final int PHIL = 3;
        void doOld(){
            int selectedBandMember = 2;
            if(selectedBandMember == JERRY){
                System.out.println("JERRY");
            }else{
                System.out.println("not Jerry");
                System.out.println("selectedBandMember = " + selectedBandMember);
            }
        }
    }
    //after Java 5.0
    public enum Members{JERRY,BOBBY,PHIL};
    public Members selectedBandMember;
    void goNew(){
        if (selectedBandMember==Members.JERRY){
            System.out.println("JERRY");
        }else{
            System.out.println("not Jerry");
            System.out.println("selectedBandMember = " + selectedBandMember);
        }
    }
    public static void main(String[] args) {
        TestEnum testEnum = new TestEnum();
        Old old = testEnum.new Old();
        old.doOld();
        testEnum.goNew();
        Members n = Members.BOBBY;
        if (n.equals(Members.JERRY)) System.out.println("Jerrrrrrrry!");
        if (n==Members.BOBBY) System.out.println("Rat Dog");
        Members ifName = Members.PHIL;
        switch (ifName){
            case JERRY:
                System.out.print("lets sing");
            case PHIL:
                System.out.print("go next, ");
            case BOBBY:
                System.out.println("Cassady!");
        }
    }
}
