  import java.util.*;

public class alt_factsum {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        long result = 0;
        long fact = 1;
        
        for (int i = 1; i <= N; i++) {
            fact *= i; // compute i!
            
            if (i % 2 == 1) {
                result += fact; // odd → add
            } else {
                result -= fact; // even → subtract
            }
        }
        
        System.out.println(result);
    }
}
  

