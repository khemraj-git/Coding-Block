import java.util.Arrays;

public class MaximumProductOF3number {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int ans = maximumProduct(nums);
        System.out.println(ans);

    }
    static int maximumProduct(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
//        Arrays.sort(nums);
        int leftProduct = nums[0]*nums[1]*nums[n-1];
        int rightProduct = nums[n-1]*nums[n-2]*nums[n-3];

        return Math.max(leftProduct,rightProduct);
    }
}
