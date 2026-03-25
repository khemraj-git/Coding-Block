import java.util.Arrays;
import java.util.Scanner;

public class o9_square_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }

        int[] newarr = new int[n];
        for (int i = 0; i < n; i++) {
            newarr[i]=arr[i]*arr[i];
        }
        Arrays.sort(newarr);

        System.out.println(Arrays.toString(newarr));
    }
}
