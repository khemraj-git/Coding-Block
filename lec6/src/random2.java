public class random2 {
    public static void main(String[] args) {
        int n = 4;

        int space = n-1;
        int row = 1;


        while(row<=n){
            for (int i = 0; i < space; i++) {
                System.out.print(" ");
            }
            int num = row;
            for (int count = 1; count <=row; count++) {
                System.out.print(num);
                num++;

            }
            num = num - 2;
            for (int count = 1; count<row;count++){
                System.out.print (num);
                num--;
            }
            row++;
//            star+=2;
            space--;
            System.out.println();
        }


    }

}
