
   import java.io.*;
import java.util.*;
public class secret_pair_destroyer {




    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String result = "";

        int count = 0;

        int i = 0;

        while(i < s.length()) {

            // check adjacent duplicates
            if(i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {

                result = result + "##";
                count++;

                i = i + 2; // skip both duplicate characters
            }
            else {

                result = result + s.charAt(i);
                i++;
            }
        }

        System.out.println("Modified String: " + result);
        System.out.println("Destroy Count: " + count);

        if(result.contains("##")) {
            System.out.println("Danger Pattern Found");
        }
    }
} 

