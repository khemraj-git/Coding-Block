import java.util.Scanner;

public class o6_help_rau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while(t-- >0) {
            System.out.println("enter all the cost");
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();

            System.out.println("enter number of rickshaw");
            int n = sc.nextInt();
            System.out.println("enter number of cab");
            int m = sc.nextInt();

            int[] rickshaw = new int[n];
            int[] cab = new int[m];

            System.out.println("enter number of time u are going to use each ricksaw");
            for (int i = 0; i < n; i++) {
                rickshaw[i] = sc.nextInt();
            }

            System.out.println("enter number of time you are going to use each cab");
            for (int i = 0; i < m; i++) {
                cab[i] = sc.nextInt();
            }

            int rickshawCost = 0;
            for (int i = 0; i < n; i++) {
                rickshawCost+=Math.min(rickshaw[i]*c1,c2);
            }

            rickshawCost = Math.min(rickshawCost,c3);


            int cabcost = 0;
            for (int i = 0; i < n; i++) {
                cabcost += Math.min(cab[i]*c1,c2);
            }

            cabcost = Math.min(cabcost,c3);


            int result = Math.min(rickshawCost+cabcost,c4);
            System.out.println(result);



        }
    }
}
