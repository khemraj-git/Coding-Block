import java.util.Scanner;

public class CustomBinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long binaryNumber = sc.nextLong();

        long decimalNumber = convertBinaryToDecimal(binaryNumber);

        System.out.println(decimalNumber);
    }

    public static long convertBinaryToDecimal(long binary) {
        long decimalNumber = 0;
        long power = 0;

        while (binary != 0) {
            long lastDigit = binary % 10;

            decimalNumber += lastDigit * Math.pow(2, power);

            binary /= 10;
            power++;
        }
        return decimalNumber;
    }
}
