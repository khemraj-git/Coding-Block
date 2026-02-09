//package Lecture5;

public class hollow_diamond {
    public static void main(String[] args) {
        int n=5;
        int space=1;
        int star=n-1;
        int row=1;

        while(row <= ((2*n)-1)){
            int i=1;
            while(i<=star){
                System.out.print("* ");
                i++;
            }
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k =1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            if (row<n){
                space+=2;
                star--;
            }
            else{
                space-=2;
                star++;
            }
            row++;

        }
    }
}
