public class hollow_pyramid {
    public static void main(String[] args) {
        int n =5;
        pattern_print(n);
    }
    static void pattern_print(int n){
        int star = 1;
        int space = 2*n -3;
        int row =1;

        while(row<=n){
            int  k= 1;
            while(k<=star){
                System.out.print("*");
                k++;
            }
            int i = 1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            int j = 1;
            while(j<=star){
                if (j==n){
                    break;
                }else {
                    System.out.print("*");
                }
                j++;
            }
            System.out.println();
            space = space -2;
            star++;
            row++;

        }
    }
}
