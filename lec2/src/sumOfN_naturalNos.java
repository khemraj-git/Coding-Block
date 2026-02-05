import java.util.Scanner;
//sum of natural number

//print even number from 1 to 10000
//sum of odd number from 1 to 10000
//multiplication table of 7
//reverse of number

public class sumOfN_naturalNos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the a natural number");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum+i;

        }
        System.out.println("sum of "+n+"natural number is:-"+sum);

        printNatural(n);

    }
    static void printNatural(int n){
        for (int i = 0; i < n; i++) {
            System.out.println(i);
        }
    }
}
