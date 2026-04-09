import java.util.Scanner;

public class wave_array {
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


        for (int j = 0; j < rows; j++) {
            if(j%2==0){
                for (int i = 0; i <cols; i++) {
                    System.out.println(arr[i][j]);
                }
            }else{
                for (int i = cols-1; i >=0 ; i--) {
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
}
