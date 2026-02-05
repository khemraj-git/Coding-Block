import java.util.Scanner;

public class pattern_printing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the value of n:-");
        int n = sc.nextInt();

//        System.out.println("square printing using for loop");
//        square_print_using_for(n);

//        System.out.println("square printing using while loop");
//        square_print_using_while(n);

//        System.out.println("right angle triangle using for loop");
//        rightangle_triangle_using_for(n);

//        System.out.println("right angle triangle using for while");
//        rightanngle_triangle_using_while(n);

//        System.out.println(" reverse right angle triangle using for loop");
//        reverse_rightAngled_triangle_using_for(n);

//        System.out.println("reverse right angle triangle using while loop");
//        reverse_rightAngled_triangle_using_while(n);

//        right_angle_triangle_with_space_using_for(n);
//            right_angle_triangle_with_space_using_while(n);

//        right_angle_triangle_with_space_using_for(n);

//        patter_with_2_space_using_while(n);

        boundry_pattern(n);
    }


    static void square_print_using_for(int n){
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void square_print_using_while(int n){
        int i = 0;
        while(i<n){
            int j = 0;
            while(j<n){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    static void rightangle_triangle_using_for(int n){
//        int i = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void rightanngle_triangle_using_while(int n){
        int i = 1;
        while (i<=n){
            int j = 1;
            while(j<=i){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void reverse_rightAngled_triangle_using_for(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >=i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void reverse_rightAngled_triangle_using_while(int n){
        int i =0;
        while (i<n){
            int j =n;
            while (j>i){
                System.out.print("* ");
                j--;
            }
            i++;
            System.out.println();
        }
    }

    static void right_angle_triangle_with_space_using_for(int n){
        int row = 0;
        int space = n-1;
        int star=1;
        for (int i = 0; i <n; i++) {

            for (int j = 0; j < space; j++) {
                System.out.print("  ");

            }
            for (int j = 0; j <star ; j++) {
                System.out.print(" *");
            }
            System.out.println();
            star++;
            row++;
            space--;


        }
    }

    static void right_angle_triangle_with_space_using_while(int n){
        int row=1;
        int space = n-1;
        int star = 1;
        while (row<=n){
            int i =1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }

            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }

            row++;
            space--;
            star++;
            System.out.println();

        }
    }

    static void patter_with_2_space_using_while(int n){
        int row=1;
        int space = 0;
        int star = n;
        while (row<=n){
            int i =1;
            while (i<=space){
                System.out.print("  ");
                i++;
            }
            int j = 1;
            while(j<=star){
                System.out.print(" *");
                j++;
            }

            row++;
            space=space+2;
            star--;
            System.out.println();
        }
    }

    static void boundry_pattern(int n){

        for (int i =0;i<=n;i++){
            for (int j = 0;j<=n;j++){
                if (i==0||j==0||i==n||j==n){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}

