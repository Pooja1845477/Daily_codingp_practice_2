import java.io.*;
import java.util.*;

public class compareadjdigit {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String num=sc.nextLine();
        String res="";
        for(int i=0;i<num.length()-1;i++){
            char curr=num.charAt(i);
            char next=num.charAt(i+1);
            if(curr>next){
            res+='>';  
            }
            else if(curr<next){
                res+='<';
            }
            else{
                res+='=';
            }
        }
        System.out.print(res);
    }
}
