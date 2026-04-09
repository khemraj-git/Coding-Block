import java.util.Arrays;
import java.util.Scanner;

public class plusOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("enter size of the matrix");
//        int n = sc.nextInt();
//
//
//        int[] arr = new int[n];
//        System.out.println("enter elements of the array:-");
//        for (int i = 0; i < n; i++) {
//            arr[i]= sc.nextInt();
//        }

        int[] arr = {9,0};
        int n = arr.length;
        System.out.println(n);
        int carry=0;

        if(arr[n-1]==9){
            arr[n-1]=0;
            carry=1;
        }
        else{
            arr[n-1]=arr[n-1]+1;
        }

        for (int i = n-2; i >=0; i--) {
            if(arr[i]==9){
                arr[i]=0;
                carry =1;
            }else if(arr[i]<9){
                arr[i]=arr[i]+carry;
                carry=0;
            }


        }

        int[] newarr = new int[n+1];
        if(carry == 1){
            newarr[0]=1;
            int i=1;

            for(int j=0;j<n;j++){
                newarr[i++] = arr[j];
            }
            System.out.println(Arrays.toString(newarr));

        }

//        for (int i = 0; i <n ; i++) {
//            if(arr[i])
//        }

        else System.out.println(Arrays.toString(arr));

    }
}
