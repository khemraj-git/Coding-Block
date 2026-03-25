import java.util.Scanner;

public class o1_inverse_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] inv = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        inverse(arr,inv,0);

        for (int i = 0; i < n; i++) {
            System.out.print(inv[i]+" ");
        }
    }

    public static void inverse(int[] arr,int[] inv,int i){

        if(i==arr.length){
            return;
        }
        int val = arr[i];
        inv[val]=i;

        inverse(arr,inv,i+1);
    }
}
