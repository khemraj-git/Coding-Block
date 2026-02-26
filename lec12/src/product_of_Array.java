import java.util.Arrays;

// leetcode problem:238
//leetcode missing number
public class product_of_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int product= 1;
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }
        int[] newarr = new int[arr.length];
        for (int j = 0; j < arr.length; j++) {
            newarr[j]=product/arr[j];
        }
        System.out.println(Arrays.toString(newarr));
    }
}
