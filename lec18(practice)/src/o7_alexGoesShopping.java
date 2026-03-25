import java.util.Scanner;

public class o7_alexGoesShopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter number of types of item shop have");
        int n = sc.nextInt();

        int[] price =new int[n];
        System.out.println("enter price of each item");
        for (int i = 0; i < n; i++) {
            price[i]= sc.nextInt();
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            // a is uske pass joh paisa hain
            int A = sc.nextInt();
            int K = sc.nextInt();

            int count = 0;
            for (int j = 0; j < n; j++) {
                if(A%price[j]==0){
                    count++;
                }
            }
            if(count>=K){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }

        }
    }
}
