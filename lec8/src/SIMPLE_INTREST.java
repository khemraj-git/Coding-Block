public class SIMPLE_INTREST {
    public static void main(String[] args) {
        int time = 3;
        int principle= 20000;
        int rate = 3;
        int result = simple_intrest(time , principle, rate);
        System.out.println("simple intrest :- "+ result);

        //using void
        simple_intrest_using_void(time,principle, rate);

    }
    static int simple_intrest(int time , int principle, int rate){
        int SI = (principle*rate*time)/100;
        return SI;
    }

    static void simple_intrest_using_void(int time , int principle, int rate){
        int SI = (principle*rate*time)/100;
        System.out.println(SI);
    }
}
