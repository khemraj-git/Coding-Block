import java.util.Scanner;

public class binary_search_in_2d_array {
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


        System.out.println("enter the target elements");
        int target = sc.nextInt();


        int row =0;
        int col = cols-1;
        int found = 0;
        while(row<rows && col>=0){
                if(target>arr[row][col]){
                    row++;
                } else if (target<arr[row][col]) {
                    col--;
                }
                else {
                    found =1;
                    System.out.println(row + " " + col);
                    break ;
                }
        }
        if(found==0){
            System.out.println("target element not present in the 2d array");
        }
    }

}

