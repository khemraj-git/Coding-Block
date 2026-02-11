import java.util.Scanner;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num 1");
        int a= sc.nextInt();
        System.out.println("enter num 2");
        int b = sc.nextInt();

        while (a%b!=0){
            int remainder = a%b ;
            if (remainder==0){
//                System.out.println(b);
                break;
            }
            else {
                a = b;
                b= remainder;
            }
        }
        System.out.println(b);
    }
}
