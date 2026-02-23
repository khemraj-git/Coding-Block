import java.util.Arrays;
import java.util.Scanner;

public class right_shift_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();

        System.out.println("enter your array elements:-");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        right_shift(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void right_shift(int[] arr){
        int last = arr[arr.length-1];
        for(int i = arr.length - 1; i > 0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
    }
}
