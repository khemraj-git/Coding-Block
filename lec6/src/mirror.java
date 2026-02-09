public class mirror {
    public static void main(String[] args) {
        int n = 5;
//        upper_half(n);
        lower_half(n);
    }
    static void upper_half(int n){
        int i = 1;
        while (i<=n){
            int j = 1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    static void lower_half(int n){
        int i = 1;

        int star=1;
        while(i<=((2*n)-1)){
            int j = 1;
            while (j<=star){
                System.out.print("*");
                j++;
            }
            if (i<n){
                star++;
            }else {
                star--;
            }
            i++;
            System.out.println();
        }

    }
}
