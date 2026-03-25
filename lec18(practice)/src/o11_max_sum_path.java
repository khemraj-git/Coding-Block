//import java

import java.util.Scanner;

public class o11_max_sum_path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            System.out.println("enter number of eleements in the array a");
            int n = sc.nextInt();
            System.out.println("enter number of elements in the array b");
            int m = sc.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            System.out.println("enter elements of array a");
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            System.out.println("enter elements of array b");
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();

            int i = 0, j = 0;
            long sum1 = 0, sum2 = 0, result = 0;

            while(i<n && j<n){
                if(a[i]<b[j]){
                    sum1 = sum1 + a[i++];
                }else if(a[i]>b[j]){
                    sum2 = sum2 + b[j++];
                }
                // common condition
                else{
                    result = result + Math.max(sum1,sum2);
                    result=result+a[i];

                    sum1=0;
                    sum2=0;

                    i++;
                    j++;
                }
            }

            while(i<n){
                sum1=sum1+a[i++];
            }
            while (j<n){
                sum2=sum2+b[j++];
            }

            result += Math.max(sum1,sum2);
            System.out.println(result);

        }
    }
}
