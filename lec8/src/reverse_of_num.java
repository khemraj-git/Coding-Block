public class reverse_of_num {
    public static void main(String[] args) {

        int n=13312;
        int result = reverse_num(n);
        System.out.println(result);
    }
    static int reverse_num(int n){
        int reverse = 0;
        while (n!=0){
            int remainder = n%10;
            reverse = reverse*10 + remainder;
            n = n/10;

        }
        return reverse;

    }
}
