
public class missing_num {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4};
        int n = arr.length;
        int total_sum = n*(n+1)/2;

        int arraysum = 0;
        for (int i = 0; i < n; i++) {
            arraysum = arraysum+arr[i];
        }
        int output = total_sum-arraysum;
        System.out.println(output);
    }

}
