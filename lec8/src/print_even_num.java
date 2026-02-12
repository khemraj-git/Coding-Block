public class print_even_num {
    public static void main(String[] args) {
        print_even_num_using_void();
    }
    static void print_even_num_using_void(){
        for (int i = 0; i < 10000; i++) {
            if (i%2==0){
                System.out.println(i);
            }

        }
    }
}
