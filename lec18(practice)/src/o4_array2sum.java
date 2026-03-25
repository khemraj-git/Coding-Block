import java.util.Arrays;
import java.util.Scanner;

public class o4_array2sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();
        }
        int target = sc.nextInt();

        print_pairs(arr,target,n);
    }

    static void print_pairs(int[] arr, int target, int n){
        Arrays.sort(arr);

        int left = 0;
        int right = n-1;

        while(left<right){
            int sum = arr[left]+arr[right];

            if(sum == target) {
                System.out.println(arr[left] + " and " + arr[right]);
                left++;
                right--;
            }
            else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
    }
}
