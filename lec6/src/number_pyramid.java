public class number_pyramid {
    public static void main(String[] args) {
        int n = 5;
        int space = n-1;
        int star=1;
//        int row =1;
        for (int row = 1; row <= n ; row++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1;k<=star;k++){
                System.out.print(row);
            }
            space--;
            star=star+2;
            System.out.println();
        }
    }
}
