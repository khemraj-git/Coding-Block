import java.util.Arrays;
import java.util.Scanner;

public class buble_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array:-");
        int n = sc.nextInt();

        System.out.println("enter the elements of the array:-");
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapeed;
        for (int i = 0; i < arr.length; i++) {
            swapeed=false;
            for (int j = 1; j < arr.length-i ; j++) {
                if (arr[j]<arr[j-1]){
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
    static void swap(int[] arr){

    }
}
