import java.util.*;
public class SingleNumber{
    public static int singleNumber(int[] arr){
        int n = arr.length;
        int result = 0;
        Arrays.sort(arr);
        for(int i = 0; i<n; i++){
            result ^= arr[i];
        }
        return result;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res = singleNumber(arr);
        System.out.println("The result is: " + res);
    }
}