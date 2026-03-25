import java.util.*;
public class MinSubarray {
    public static int min(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i<n; i++){
            int min = arr[i];
            for(int j = i; j<n; j++){
                if(arr[j] < min){
                    min = arr[j];
                }
                sum += min;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int result = min(arr);
        System.out.println(result);
    }
}