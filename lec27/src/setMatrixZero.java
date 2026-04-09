import java.util.Arrays;
import java.util.Scanner;

public class setMatrixZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("enter number of rows");
//        int rows = sc.nextInt();
//
//        System.out.println("enter number os cols");
//        int cols = sc.nextInt();
//
//        int[][] arr = new int[rows][cols];
//
//        // arrayinput
//        System.out.println("enter elements of arrays");
//        for (int row = 0; row < rows; row++) {
//            for (int col = 0; col < cols; col++) {
//                arr[row][col]= sc.nextInt();
//            }
//        }
//
        int rows = 3;
        int cols = 4;
        int[][] arr = {
                {0,1,2,0},
                {3,4,5,2},
                {1,3,1,5}
        };


        boolean[] rowsZero = new boolean[rows];
        boolean[] colsZero = new boolean[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(arr[i][j]==0){
                    rowsZero[i]=true;
                    colsZero[j]=true;
                }
            }
        }
        System.out.println(Arrays.toString(rowsZero));
        System.out.println(Arrays.toString(colsZero));

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(rowsZero[i]== true || colsZero[j]==true){
                    arr[i][j]=0;
                }
            }

        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
