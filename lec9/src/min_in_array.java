import java.util.Scanner;

public class min_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        int result = find_min(arr);
        System.out.println("minimum element in the array:-"+result);
    }
    static int find_min(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }
}
