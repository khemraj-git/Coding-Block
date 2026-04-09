import java.util.Scanner;

public class o7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int digits = 0;
        int result = 0;
        while(x!=0){
            digits = x%10;
            result = digits + result*10;
            x=x/10;

        }
        System.out.println(result);

    }
}
