public class pattern_printing_pt2 {
    public static void main(String[] args) {
        int n = 5;

//        pyramid_pattern(n);
        pyramid_pattern_using_for(n);

    }

    static void pyramid_pattern(int n){
        int space = n-1;
        int star = 1;
        int row = 1;
        while(row<=n){
            int i =1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }
            int j =1;
            while(j<=star){
                System.out.print("*");
                j++;
            }
            System.out.println();
            row++;
            star=star+2;
            space--;
        }

    }
    static void pyramid_pattern_using_for(int n){
        int space = n-1;
        int star=1;
//        int row =1;
        for (int row = 1; row <= n ; row++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int k = 1;k<=star;k++){
                System.out.print("*");
            }
            space--;
            star=star+2;
            System.out.println();
        }

//        row++;



    }
}



















