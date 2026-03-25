public class trappingrainwater {
    public static void main(String[] args) {
        int[] arr = {4,2,0,3,2,5};

        int n = arr.length;
        int left = 0;
        int right = n-1;

        int leftmax = 0;
        int rightmax = 0;
        int totalwater = 0;

        while (left<right) {
            if (arr[left] < arr[right]) {
                if (arr[left] >= leftmax) {
                    leftmax = arr[left];
                } else {
                    int trapped_Water = leftmax - arr[left];
                    totalwater += trapped_Water;
                }
                left++;
            } else {

                if (arr[right] >= rightmax) {
                    rightmax = arr[right];
                } else {
                    int trapped_Water = rightmax - arr[right];
                    totalwater += trapped_Water;

                }
                right--;
            }
        }
        System.out.println(totalwater);

        int naive1 = naive(arr);
        System.out.println(naive1);
    }

    // naive approach
    static int naive(int[] arr){
        int n = arr.length;

        int total_water = 0;

        for (int i = 0; i < arr.length; i++) {
            int leftmax = 0;
            int rightmax = 0;
            for (int j = 0; j <=i; j++) {
                leftmax = Math.max(leftmax,arr[j]);
            }
            for (int j = i; j < arr.length; j++) {
                rightmax = Math.max(rightmax,arr[j]);
            }

            total_water += Math.min(leftmax,rightmax)-arr[i];

        }
        return total_water;
    }
}
