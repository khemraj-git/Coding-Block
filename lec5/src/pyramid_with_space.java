public class pyramid_with_space {
    public static void main(String[] args) {
        int n =7;
        pattern_print(n);
    }
    static void pattern_print(int n){
        int space = n-1;
        int star =1;
        int row = 1;
        while(row<=n){
            int i = 1;
            while(i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while (j<=star){
                if (j%2==1){
                    System.out.print(" * ");
                }else{
                    System.out.print(" ");
                }
                j++;
            }
            System.out.println();
            space--;
            row++;
            star=star+2;
        }
    }

}
