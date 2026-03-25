import java.util.Scanner;

public class game_exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        int i = 0;
        int j = n-1;
        int aniket = 0;
        int bhanu = 0;

        boolean turn = true;
        while (i<=j){
            int pick;
            if(arr[i]>arr[j]){
                pick = arr[i];
                i++;
            }else{
                pick = arr[j];
                j--;
            }
            if(turn){
                aniket+=pick;
            }else{
                bhanu+=pick;
            }
            turn = !turn;
        }

        System.out.println(aniket+"  "+bhanu);
    }
}
