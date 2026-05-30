import java.util.*;

public class mirroredegedetect {
    
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.charAt(0)==s.charAt(s.length()-1)&&s.charAt(1)==s.charAt(s.length()-2)){
            System.out.println("Mirror Trap Activated");
            String result="";
            String middle=s.substring(2,s.length()-2);
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
                    result+="*";
                else
                    result+=s.charAt(i);
                
            }
            System.out.println("Middle Part: "+middle);
            System.out.println("Transformed String: "+result);
        }
        else{
            System.out.println("Trap Failed");
        }
    }
}
