import java.util.*;
public class diamond_with_mid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = n/2;
        int star = 1;
        int row = 1;
        int mid = (n/2)+1;

        while(row<=n){
            for(int i = 0; i <space ; i++){
                System.out.print("\t");
            }
            for(int j = 0; j <star;j++){
                System.out.print("*\t");
            }
            if(row<mid){
                star= star+2;
                space--;
            }else{
                star = star-2;
                space++;
            }
            row++;
            System.out.println();
        }
    }
}
