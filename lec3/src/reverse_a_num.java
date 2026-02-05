import java.util.Scanner;

public class reverse_a_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number to reverse:-");
        int num = sc.nextInt();

        int reverse_num  = 0;
        while (num >0){
            int remainder = num%10;
            reverse_num = reverse_num*10 + remainder;
            num=num/10;
        }
        System.out.println("the reverse num is:-"+reverse_num);
    }
}
