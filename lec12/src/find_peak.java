import java.util.Scanner;

public class find_peak {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array:-");
        int n = sc.nextInt();

        System.out.println("enter the elements of the array:-");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int result = find_peak_index(arr);
        System.out.println(result);
    }
    static int find_peak_index(int[] arr){
        for (int i = 1; i < arr.length-1; i++) {
            if(arr[i]>arr[i-1]&&arr[i]>arr[i+1]){
                return i;
            }
        }
        return -1;
    }
}
