import java.util.Scanner;

public class prime_no_range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter the number till to print the prime number");
        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {
            boolean isprime=true;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    isprime=false;
                    break;
                }
            }
            if (isprime==true){
                System.out.println(i);
            }
        }
    }
}
