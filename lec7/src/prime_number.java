import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value n");
        int n = sc.nextInt();
        boolean isprime=true;
        for (int i = 2; i <n; i++) {
            if (n%i==0){
                isprime=false;
                break;
            }

        }
        if (isprime){
            System.out.println("it is a prime num");
        }else {
            System.out.println("it is not a prime num");
        }

    }
}
