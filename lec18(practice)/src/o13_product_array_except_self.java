import java.util.Scanner;

public class o13_product_array_except_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] output = new int[n];
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if(i!=j){
                    product=product*arr[j];
                }
            }

            output[i] = product;
        }
        for (int i = 0; i < n; i++) {
            System.out.println(output[i]+ " ");
        }
    }
}
