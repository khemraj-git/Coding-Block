import java.util.Scanner;

public class o16_majority_element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int ans = majority_element(arr);
        System.out.println(ans);

    }
    static int majority_element(int[] arr){
        int count = 0;
        int candidate = 0;

        for(int num: arr) {
            if (count == 0) {
                candidate = num;
            }
            if(num==candidate){
                count++;
            }else{
                count--;
            }

        }
        return candidate;
    }

}
