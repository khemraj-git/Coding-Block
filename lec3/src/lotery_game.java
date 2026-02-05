import java.util.Scanner;

public class lotery_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number:-");
        int n = sc.nextInt();

        if(n>=300 && n<=460){
            System.out.println("you have win macbook");
        } else if (n>=200 && n<= 280 ) {
            System.out.println("you have won a kurkure");
        } else if(n>=1100 && n<=1500) {
            System.out.println("you have won a cycle");
        } else if (n>50 && n<= 80) {
            System.out.println("the prize is a bike");
        }else {
            System.out.println("better luck next time");
        }
    }
}
