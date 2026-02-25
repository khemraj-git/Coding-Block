import java.util.Arrays;
import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the array:-");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }

        selection(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
//            System.out.println("...");
            //swap code
            swap(arr,i,min );
//            System.out.println("...");
        }
    }
    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
