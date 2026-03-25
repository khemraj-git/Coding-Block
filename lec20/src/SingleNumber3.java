import java.util.*;
public class SingleNumber3{
    public static int[] singleNumber3(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int[] nums = new int[2];
        int k = 0;
        int i = 0;
        while(i<n-1){
            if(arr[i] != arr[i+1]){
                nums[k] = arr[i];
                k++;
                i++;
            }
            else{
                i+=2;
            }
        }
        if(k==1){
            nums[k] = arr[n-1];
        }
        return nums;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] res  = singleNumber3(arr);
        for(int i = 0; i<2; i++){
            System.out.print(res[i]);
        }
    }
}