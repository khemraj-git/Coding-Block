import java.util.Scanner;

public class total_sum_of_2d_array {
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

        int sum = 0;
        //array print
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                sum = sum + arr[row][col];

            }
            System.out.println();
        }
        System.out.println(sum);





    }
}
