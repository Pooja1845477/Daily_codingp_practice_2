import java.io.*;
import java.util.*;

public class substrstart_withb {


public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int count=0;
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                
                if(sub.charAt(0)=='b'){
                    System.out.println(sub);
                    count++;
                }
            }
                }
        System.out.print("Count = "+count);
    }
}
