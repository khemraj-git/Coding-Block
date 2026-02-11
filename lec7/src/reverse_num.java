public class reverse_num {
    public static void main(String[] args) {
        int n = 143;
        int output = 0;

        while (n!=0){
            int result = n%10;
            output= output*10+result;
            n = n/10;
        }
        System.out.println("reverse of the number n:-"+output);
    }
}
