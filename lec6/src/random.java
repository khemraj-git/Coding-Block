public class random {
    public static void main(String[] args) {
        int n = 5;

        int count = 1;
        int i = 0;
        while(i<=n){
            int j = 0;
            while(j<=i){
                System.out.print(count);
                count++;
                j++;
            }
            i++;
            System.out.println();
        }

    }
}
