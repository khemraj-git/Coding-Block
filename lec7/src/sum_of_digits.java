public class sum_of_digits {
    public static void main(String[] args) {
        int n = 1122;
        int sum = 0;

        while (n!=0){
            int last = n%10;
            sum = sum+last;
            n = n/10;

        }
        System.out.println("sum of digits in n:-"+sum);
    }
}
