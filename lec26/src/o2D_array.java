import java.util.Arrays;
import java.util.Scanner;

public class o2D_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of rows");
        int rows = sc.nextInt();

        System.out.println("enter number os cols");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        // arrayinput
        System.out.println("enter elements of arrays");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                arr[row][col]= sc.nextInt();
            }
        }

        //array print
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }





    }
}
