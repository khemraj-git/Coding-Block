import java.util.Scanner;

public class o3_linearsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();

        int result = search(arr,target,n);
        System.out.println(result);
    }

    static int search(int[] arr, int target,int n){
        for (int i = 0; i < n; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
}
