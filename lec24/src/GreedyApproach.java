import java.util.*;
public class GreedyApproach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int A = 0;
        int B = 0;
        int t = 1;
        int i = 0;
        int j = n-1;
        while(i<=j){
            if(t==1){
                if(arr[i] < arr[j]){
                    A += arr[j];
                    j--;
                }
                else{
                    A += arr[i];
                    i++;
                }
                t=0;
            }
            else{
                if(arr[i]<arr[j]){
                    B += arr[j];
                    j--;
                }
                else{
                    B += arr[i];
                    i++;
                }
                t=1;
            }
        }
        System.out.print(A + " " + B);
    }
}