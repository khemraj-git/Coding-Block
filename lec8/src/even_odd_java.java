public class even_odd_java {
    public static void main(String[] args) {
        int num1 = 11;
        even_odd(num1);
    }
    static void even_odd(int num1){
        if (num1%2==0){
            System.out.println("the num is even");
        }else {
            System.out.println("the num is odd");
        }
    }

}
