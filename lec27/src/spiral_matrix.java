import java.util.Scanner;

public class spiral_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("enter number of rows");
//        int rows = sc.nextInt();

        int rows = 5;

//        System.out.println("enter number os cols");
//        int cols = sc.nextInt();

        int cols = 5;

//        int[][] arr = new int[rows][cols];
//
//        // arrayinput
//        System.out.println("enter elements of arrays");
//        for (int row = 0; row < rows; row++) {
//            for (int col = 0; col < cols; col++) {
//                arr[row][col]= sc.nextInt();
//            }
//        }

        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}
        };

        int top = 0;
        int left = 0;
        int right = cols -1;
        int bottom = rows -1;

        while(top<= bottom && left <= right){
            //left to right
            for (int i = left; i <= right ; i++) {
                System.out.print(arr[top][i]+" ");
            }
            top++;

            // top to bottom
            for (int i = top; i <= bottom ; i++) {
                System.out.print(arr[i][right]+" ");
            }
            right--;

            // right to left
            for (int i = right; i >= left; i--) {
                System.out.print(arr[bottom][i]+" ");
            }
            bottom--;

            // bottom to top
            for (int i = bottom; i >= top ; i--) {
                System.out.print(arr[i][left]+" ");
            }
            left++;

        }
    }
}
