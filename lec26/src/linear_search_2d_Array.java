import java.util.Scanner;

public class linear_search_2d_Array {
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
        System.out.println("enter element to search");
        int target = sc .nextInt();
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if(target==arr[row][col]){
                    System.out.println(target);
                }
            }
            System.out.println();
        }





    }
}
