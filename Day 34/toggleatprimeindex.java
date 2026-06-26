import java.io.*;
import java.util.*;

public class Solution {
//checking index is prime or not
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
//toggling the char at prime number index
            if (isPrime(i)) {
                if (Character.isLowerCase(ch)) {
                    ans += Character.toUpperCase(ch);
                } else if (Character.isUpperCase(ch)) {
                    ans += Character.toLowerCase(ch);
                } else {
                    ans += ch;
                }
            } else {
                ans += ch;
            }
        }

        System.out.print(ans);
    }
}