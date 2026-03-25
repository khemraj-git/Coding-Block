
//import j

import java.util.Scanner;

public class ma_circular_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // create extended array
            int[] ext = new int[2 * n];
            for (int i = 0; i < 2 * n; i++) {
                ext[i] = arr[i % n];
            }

            int maxSum = Integer.MIN_VALUE;

            // try all starting points
            for (int i = 0; i < n; i++) {
                int sum = 0;

                // take at most n elements
                for (int j = i; j < i + n; j++) {
                    sum += ext[j];
                    maxSum = Math.max(maxSum, sum);
                }
            }

            System.out.println(maxSum);
        }
    }
}
