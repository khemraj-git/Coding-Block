
//problem statement
/*
* you have to take two variable as input = first term a , difference d
* you have to print a =1, d=2
* output = till 5- ap series
* */

import java.util.Scanner;

public class Arithmetic_progression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the first term of the AP");
        int a = sc.nextInt();

        System.out.println("enter the common difference in the AP");
        int d = sc.nextInt();

        for (int i = 0; i <= 50; i++) {
            a = a+d;
            System.out.println(a);
        }
    }
}
