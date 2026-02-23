public class random {
    public static void main(String[] args) {
        int n = 5;


        for (int i = 1; i <= n; i++) {
            int k = n;
            for (int j = 1; j <= n; j++) {
                if (i+j==n+1){
                    System.out.print("*");
                }
                else {
                    System.out.print(k);
                }
                k--;
            }
            System.out.println();
        }

//        for (int i = n-1; i >=0 ; i--) {
//            for (int j = 0; j < n; j++) {
//                if (j==i){
//                    System.out.print("*");
//                }else {
//                    System.out.print(n-j);
//                }
//
//            }
//            System.out.println();

//        }

    }
}
