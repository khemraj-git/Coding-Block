import java.util.Arrays;
import java.util.Scanner;

public class o5_pair_of_roses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of test case");
        int t = sc.nextInt();
        while(t-- >0) {
            System.out.println("enter size of array");
            int n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("enter array elements");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("enter the amount which deepak have");
            int target = sc.nextInt();

            Arrays.sort(arr);

            int left =0;
            int right = n-1;

            int ans1 = 0;
            int ans2 = 0;

            int minDiff = Integer.MAX_VALUE;

            while(left<right){
                int sum = arr[left]+arr[right];

                if(sum == target){
                    int dif = arr[right]-arr[left];

                    if(dif<minDiff){
                        minDiff=dif;
                        ans1 = arr[left];
                        ans2 = arr[right];
                    }
                    left++;
                    right--;

                } else if (sum<target) {
                    left++;
                }else{
                    right--;
                }

            }
            System.out.println("Deepak should buy roses whose prices are "
                    + ans1 + " and " + ans2 + ".");

            System.out.println();
        }

    }
}
