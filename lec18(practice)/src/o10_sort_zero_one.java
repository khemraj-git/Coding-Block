import java.util.Scanner;

public class o10_sort_zero_one {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int countZero = 0;

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
            if(arr[i]==0){
                countZero++;
            }
        }

        for (int i = 0; i < countZero; i++) {
            System.out.println("0 ");
        }

        for (int i = countZero; i <n ; i++) {
            System.out.println("1 ");
        }
    }
}
