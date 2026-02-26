import java.util.Arrays;

public class rotate_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] nums,int start, int end){
        while (start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
    static void rotate(int[] nums,int k){

        k=k% nums.length;
        reverse(nums,0,nums.length-1);

        reverse(nums,0,k-1);

        reverse(nums,k,nums.length-1);
    }
}
//    static void right_shift(int[] arr){
//        int last = arr[arr.length-1];
//        for(int i = arr.length - 1; i > 0; i--){
//            arr[i] = arr[i - 1];
//        }
//        arr[0] = last;
//    }
//    static void rotate(int[] nums,int k){
//        for (int i = 0; i < k; i++) {
//            right_shift(nums);
//        }
//    }


