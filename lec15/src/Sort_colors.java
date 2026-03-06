import java.util.Arrays;

public class Sort_colors {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
//        sortColors(nums);

//        sortColors1(nums);


        sortColors2(nums);

        System.out.println(Arrays.toString(nums));

    }
    // using bubble sort
    static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length-1-i; j++) {
                if(nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
    }

    //using selection sort
    static void sortColors1(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int min = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j]<nums[min]){
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i]=nums[min];
            nums[min]=temp;
        }
    }

    // using insertion sort
    static void sortColors2(int[] nums){
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(nums[j]<nums[j-1]){
                    int temp = nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
    }
}
