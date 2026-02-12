public class max_of_3 {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 432;
        int num3 = 34432;
        //max_of 3_using int return type
//        int result2 = max_of_3(num1,num2,num3);
//        System.out.println("max of 3 number is "+result2);

        //max of 3 using void return type
        max_of_3_using_void(num1,num2,num3);
    }
    static int max_of_3(int num1, int num2 , int num3){
        if (num1>num2 && num1>num3) {
            return num1;
        } else if (num2>num1 && num2>num3) {
            return num2;
        } else {
            return num3;
        }
    }

    static void max_of_3_using_void(int num1, int num2 , int num3){
        if (num1>num2 && num1>num3) {
            System.out.println(num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }
}
