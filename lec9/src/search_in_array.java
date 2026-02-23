import java.util.Scanner;

public class search_in_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("enter the elements of the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the target element");
        int target = sc.nextInt();

        int result = search(arr,target);
        if (result==1){
            System.out.println("target has been found");
        }else{
            System.out.println("target has been not found");
        }
    }
    static int search(int[] arr,int target){

        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];
            if (element==target){
                return 1;
            }
        }
        return -1;
    }
}
