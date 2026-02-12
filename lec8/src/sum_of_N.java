public class sum_of_N {
    public static void main(String[] args) {
        int num_1=50;
        int result = sum_of_n(num_1);
        System.out.println(result);

        sum_of_n_using_void(num_1);

    }
    static int sum_of_n(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum+i;

        }
        return sum;
    }
    static void sum_of_n_using_void(int n){
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
