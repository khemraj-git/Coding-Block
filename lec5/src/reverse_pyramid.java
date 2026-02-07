public class reverse_pyramid {
    public static void main(String[] args) {
        int n = 8;
        reverse_pyramid1(n);
    }

    static void reverse_pyramid1(int n) {
        int space = 0;
        int star=2*n-1;
        int row =1;

        while(row<=n){
            int i =1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            int j=1;
            while(j<=star){
                System.out.print("*");
                j++;
            }
            System.out.println();
            space++;
            star=star-2;
            row++;
        }
    }
    static void reverse_pyramid_using_for(int n){
        int space = 0;
        int star = 2*n-1;
        for (int row =1; row<=n;row++){

        }

    }
}