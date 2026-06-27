import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=s.split(" ");
        int longestindex=0;//index for the longest word in the input sentence
        int maxlength = words[0].length();
        //finding the longest or max length word
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > maxlength) {
                maxlength = words[i].length();
                longestindex = i;
            }
        }

        String res= "";

        for (int i = 0; i < words[longestindex].length(); i++) {
            char ch = words[longestindex].charAt(i);

            if (Character.isLowerCase(ch)) {
                res+= Character.toUpperCase(ch);
            } else if (Character.isUpperCase(ch)) {
                res += Character.toLowerCase(ch);
            } else {
                res += ch;
            }
        }

        words[longestindex] = res;

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            if (i != words.length - 1) {
                System.out.print(" ");
            }
        }
    }
}
