import java.io.*;
import java.util.*;

public class remdupusername {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String w[]=s.split("@");
        boolean duplicate[]=new boolean[256];
        for(int i=0;i<w[0].length();i++){
            char ch=w[0].charAt(i);
        
        if(!duplicate[ch]){
          System.out.print(ch);
          duplicate[ch]=true;  
        }
        }
        System.out.print("@"+w[1]);
    }
}
