public class sum_of_even {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i <= 10000; i++) {
            if (i%2==0){
                sum=sum+i;
            }

        }
        System.out.println("sum of even number till 10000:-"+sum);

        //print evene number
        printEven();
    }
    static void printEven(){
        for (int i = 0; i < 10000; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
//        return 0;
    }
}
