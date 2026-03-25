public class o17_trapping_rainwater {
    public static void main(String[] args) {

        // Input array (heights of bars)
        int[] arr = {4,2,0,3,2,5};
        int n = arr.length;

        // Two pointers: start and end
        int left = 0, right = n - 1;

        // To store maximum height seen so far from left and right
        int leftMax = 0, rightMax = 0;

        // Total water trapped
        int water = 0;

        // Traverse until both pointers meet
        while(left <= right) {

            // We always process the smaller side
            // because water is limited by the smaller boundary
            if(arr[left] <= arr[right]) {

                // If current height is greater than leftMax,
                // update leftMax (new boundary)
                if(arr[left] >= leftMax) {
                    leftMax = arr[left];
                }
                else {
                    // Otherwise, water can be trapped
                    // water = leftMax - current height
                    water += leftMax - arr[left];
                }

                // Move left pointer forward
                left++;

            } else {

                // Same logic for right side
                if(arr[right] >= rightMax) {
                    rightMax = arr[right];
                }
                else {
                    // Water trapped on right side
                    water += rightMax - arr[right];
                }

                // Move right pointer backward
                right--;
            }
        }

        // Final result
        System.out.println(water);
    }
}
