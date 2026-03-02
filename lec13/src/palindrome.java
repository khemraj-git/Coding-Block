import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean ans = isPalindrome(num);
        System.out.println(ans);

    }
    static boolean isPalindrome(int x) {

        int reverse = 0;
        while (x!=0) {
            int digits = x % 10;
            reverse = reverse * 10 + digits;
            x = x / 10;
        }
        System.out.println(reverse);

        if(reverse!=x){
            return false;
        }else{
            return true;
        }
    }
}
