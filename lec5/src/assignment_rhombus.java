import java.util.Scanner;

public class assignment_rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int space = n-1;

        int mid = (n/2)+1;
        int row = 1;
        while (row<=2*n-1){
            int current_row = 0;
            if (row<= n){
                current_row = row;
            }else {
                current_row = ((2*n)-1)-row+1;
            }
            for (int i = 0; i < space; i++) {
                System.out.print("\t");
            }
            int num=current_row;

            for (int count = 1; count <= current_row; count++) {
                System.out.print(num+"\t");
                num++;
            }
            num=num-2;
            for (int count = 1; count < current_row; count++) {
                System.out.print(num+"\t");
                num--;
            }
            if (row<n){

                space--;
            }else {

                space++;
            }
            row++;
            System.out.println();
        }
    }
}
