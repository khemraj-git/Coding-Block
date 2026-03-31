import java.util.Scanner;

public class monotonic_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = {1,2,2,3};
        boolean result = isMonotonic(nums);
        System.out.println(result);
    }
        static boolean isMonotonic(int[] nums) {
            boolean isInc = true;
            boolean isDesc = true;


            for(int i = 1; i<nums.length;i++){
                if(nums[i]>nums[i-1]){
                    isDesc = false ;
                }
                if(nums[i]<nums[i-1]){
                    isInc = false;
                }
            }
            return isInc || isDesc;
        }

}
