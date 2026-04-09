import static java.lang.Math.max;
import static java.lang.Math.min;

public class container_with_most_water {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        int n = height.length;
        System.out.println(n);

        int left = 0;
        int right = n-1;
        int leftmax= 0;
        int rightmax = 0;
        int water = 0;
        int area = 0;
        int maxarea = 0;

        while(left<right){
            area = (right - left) * min(height[left], height[right]);

            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
            maxarea = max(maxarea,area);
        }
        System.out.println(maxarea);



    }
}
