 import java.io.*;
import java.util.*;

public class substringlengthgreaterthan2 {
  

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.length()==0){
            System.out.println("String is Empty");
            return;
        }
            if(s.length()<=2){
                System.out.println("No Substring  length > 2");
                return;
            
        }
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                if(sub.length()>2){
                    System.out.println(sub);
                    count++;
                }
            }
        }
        System.out.println("Count = "+count);
    }
}