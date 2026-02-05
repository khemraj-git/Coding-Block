import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check:-");
        int n = sc.nextInt();
        if(n%2==0){
            System.out.println("it is a even no.");
        }else {
            System.out.println("not a even no.");
        }
    }
}
