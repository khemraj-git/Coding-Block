public class problem3 {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4};
        boolean ans = find_duplicates(arr);

        System.out.println(ans);
    }
    static boolean find_duplicates(int[] arr){
        boolean result = false;
        for (int i = 0; i < arr.length-1 ; i++) {
            if(arr[i]==arr[i+1]){
                result = true;
                break ;
            }

        }
        return result;
    }
}
