public class MaximumProductOF3number {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int ans = maximumProduct(nums);
        System.out.println(ans);

    }
    static int maximumProduct(int[] nums) {

        int product = 1;
        int maxproduct = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length ; i++) {
            product=product*nums[i];
            if(maxproduct<product){
                maxproduct=product;
            }
            if (maxproduct<0){
                product=1;
            }
        }
        return maxproduct;
    }
}
