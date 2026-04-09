import java.util.Scanner;

public class tranpose_of_matrix {
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


        int[][] result = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = arr[i][j];
            }
        }

        // print
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
