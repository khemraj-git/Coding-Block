import java.util.Arrays;
import java.util.Scanner;

public class left_Shift_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array");
        int n = sc.nextInt();

        System.out.println("enter the array elements:-");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        left_shift(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void left_shift(int[] arr){
        int first = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1]=first;
    }
}
