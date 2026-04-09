import java.util.Scanner;

public class multiplication_matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter rows of first matrix:");
        int r1 = sc.nextInt();

        System.out.println("Enter cols of first matrix:");
        int c1 = sc.nextInt();

        System.out.println("Enter rows of second matrix:");
        int r2 = sc.nextInt();

        System.out.println("Enter cols of second matrix:");
        int c2 = sc.nextInt();

        // Check condition
        if(c1 != r2){
            System.out.println("Matrix multiplication not possible");
            return;
        }

        int[][] A = new int[r1][c1];
        int[][] B = new int[r2][c2];
        int[][] result = new int[r1][c2];

        // Input first matrix
        System.out.println("Enter first matrix:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                A[i][j] = sc.nextInt();
            }
        }

        // Input second matrix
        System.out.println("Enter second matrix:");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                B[i][j] = sc.nextInt();
            }
        }

        // Matrix multiplication
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                for(int k=0;k<c1;k++){
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        // Print result
        System.out.println("Result Matrix:");
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}