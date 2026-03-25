import java.util.*;
public class SingleNumber2{
    public static int singleNumber2(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        for(int i = 0; i<n-1; i+=3){
            if(arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return arr[n-1];
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res = singleNumber2(arr);
        System.out.println("The result is: " + res);
    }
}