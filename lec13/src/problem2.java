import java.util.Arrays;

public class problem2 {
    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,0,1};
//        1 0 0 1 0 1 0 -> 1 0 0 1 1 0 0 -> 1 0 1 1 0 0 0

        bubble(arr);

        System.out.println(Arrays.toString(arr));

    }
    static void bubble(int[] arr){
        boolean swapeed;
        for (int i = 0; i < arr.length; i++) {
            swapeed=false;
            for (int j = 1; j < arr.length-i ; j++) {
                if (arr[j]>arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapeed=true;
                }
            }
            if(swapeed==false){
                break;
            }
        }
    }

}
