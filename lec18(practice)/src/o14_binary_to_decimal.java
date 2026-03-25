//import j
//
import java.util.Scanner;

public class o14_binary_to_decimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            String binary = sc.next(); // take as string

            int decimal = 0;
            int power = 0;

            // go from right to left
            for (int i = binary.length() - 1; i >= 0; i--) {
                int digit = binary.charAt(i) - '0';
                decimal += digit * Math.pow(2, power);
                power++;
            }

            System.out.println(decimal);
        }
    }
}
