import java.util.Scanner;

public class lotery_game_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to get your reward");
        int n = sc.nextInt();

        if (n>=300 && n<=460){
            System.out.println("you won a macbook");
            if (n >= 300 && n <= 380){
                System.out.println("Model: M1 mac");
            } else if (n>=381 && n<=460) {
                System.out.println("Model: M2 mac");
            }
        } else if (n>=200&&n<=280) {
            System.out.println("you won a pack of kurkure");
            if (n>=200&&n<=240){
                System.out.println("Flavour: chilli kukure");
            } else if (n>=240&&n<=280) {
                System.out.println("Flavour: onion kurkure");
            }
        } else if (n>50&&n<=80) {
            System.out.println("you won a bike");
            if (n>50&&n<=65){
                System.out.println("Model: Bullet");
            } else if (n>65&&n<80) {
                System.out.println("Model: Rajdoot");
            }
        }else {
            System.out.println("better luck next time");
        }
    }
}
