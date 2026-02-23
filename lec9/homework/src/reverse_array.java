import java.util.Arrays;
import java.util.Scanner;

public class reverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();

        System.out.println("enter the elements of the array:-");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        reverse_array1(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

//        System.out.println(Arrays.toString(arr));
    }
    static void reverse_array1(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start<end){
            int temp = arr[start];

            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
}
