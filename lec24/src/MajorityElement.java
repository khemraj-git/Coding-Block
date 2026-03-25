import java.util.*;
public class MajorityElement {
    public static int[] majority(int[] arr){
        int n = arr.length;
        Arrays.sort(arr);
        int[] newArr = new int[n];

        int i = 0;
        int k = 0;
        while(i<n){
            int j = i;
            int cnt = 0;
            while(j<n && arr[i] == arr[j]){
                cnt ++;
                j++;
            }
            if(cnt > n/3){
                newArr[k++] = arr[i];
            }
            cnt = 0;
            i = j;
        }
        return newArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] result = majority(arr);
        for(int i = 0; i<result.length; i++){
            if(result[i] !=0)System.out.print(result[i] + " ");
        }
    }
}