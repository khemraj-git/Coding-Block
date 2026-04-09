import java.util.Arrays;
import java.util.Scanner;

public class spiral_matrixII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of rows");
        int n = sc.nextInt();



        int[][] arr = new int[n][n];

        int top = 0;
        int left = 0;
        int right = n-1;
        int bottom = n-1;

        int count = 1;

        while (left<= right && top <= bottom){
            //left to right
            for (int i = left; i <= right ; i++) {
                arr[left][i]=count;
                count++;
            }
            top++;

            // top to bottom
            for (int i = top; i <= bottom ; i++) {
                arr[i][right] = count;
                count++;
            }
            right--;

            // right to left
            for (int i = right; i >= left ; i--) {
                arr[bottom][i] = count;
                count++;
            }
            bottom--;

            // bottom to top
            for (int i = bottom; i >= top; i--) {
                arr[i][left]=count;
                count++;
            }
            left++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                System.out.print(Arrays.toString(arr));
            }
            System.out.println();
        }

        System.out.print(Arrays.toString(arr));

    }
}
