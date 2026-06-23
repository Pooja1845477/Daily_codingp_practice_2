import java.io.*;
import java.util.*;

public class revateven {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String w[]=s.split(" ");
for(int i=0;i<=w.length-1;i++){
if(i%2==0){
    for(int j=w[i].length()-1;j>=0;j--){
        char ch=w[i].charAt(j);
        System.out.print(ch);
    }
    }
else
System.out.print(w[i]);
System.out.print(" ");
    }
    }
}
