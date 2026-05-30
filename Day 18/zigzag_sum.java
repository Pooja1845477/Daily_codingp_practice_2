 import java.util.*;

public class zigzag_sum {
 


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long result = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 3 == 0) {
                result -= 2 * i;   
            } else {
                result += i;       
            }
        }

        System.out.println(result);
    }
}
  

