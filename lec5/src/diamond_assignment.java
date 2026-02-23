import java.util.*;
public class diamond_assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int mid = n / 2;

        int i = 0;

        while (i < n) {

            int j = 0;

            while (j < n) {
                if (i == 0 || i == n - 1 ||
                        j == 0 || j == n - 1) {

                    System.out.print("*\t");
                }
                else if (i <= mid &&
                        (j == mid - i || j == mid + i)) {

                    System.out.print("*\t");
                }
                else if (i > mid &&
                        (j == i - mid || j == (3 * mid - i))) {

                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }

                j++;
            }

            System.out.println();
            i++;
        }
    }
}
