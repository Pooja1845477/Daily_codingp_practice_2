import java.util.*;

public class boundary_swap_cipher {
 public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
        //swapping the first and last character
        String swapped=s.charAt(s.length()-1)+s.substring(1,s.length()-1)+s.charAt(0);
        //extracting the middle subsstring
        String middle=swapped.substring(1,swapped.length()-1);
        //checking for vowel in swapped string
        String result="";
        for(int i=0;i<swapped.length();i++){
            if(swapped.charAt(i)=='a'||swapped.charAt(i)=='e'||swapped.charAt(i)=='i'
               ||swapped.charAt(i)=='o'||swapped.charAt(i)=='u'||
               swapped.charAt(i)=='A'||swapped.charAt(i)=='E'||swapped.charAt(i)=='I'
               ||swapped.charAt(i)=='O'||swapped.charAt(i)=='U')
                result+="*";
            
            else{
                result+=swapped.charAt(i);
            }
        }
        System.out.println("Swapped String: "+result);
        System.out.println("Middle Substring: "+middle);
        if(result.contains("99")){
            System.out.println("Ultra Code");
        }
    }
}    

