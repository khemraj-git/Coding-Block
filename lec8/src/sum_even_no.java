public class sum_even_no {
    public static void main(String[] args) {
        int result = sum_of_even_using_int();
        System.out.println(result);
    }
    static int sum_of_even_using_int(){
        int sum = 0;
        for (int i = 0; i < 10000; i++) {
            if (i%2==0){
                sum=sum+i;
            }
        }
        return sum;
    }
}
