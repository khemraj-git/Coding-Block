import java.util.Scanner;

public class points_on_line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter coordinates of point A:-");
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        System.out.println("enter coordinates of point B:-");
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println("enter coordinates of point C:-");
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        int m1 = (y2-y1)/(x2-x1);

        int m2 = (y3-y2)/(x3-x2);

        if (m1==m2){
            System.out.println("all points lies on the same line");
        }else {
            System.out.println("points don't lie on the same line");
        }
    }
}
