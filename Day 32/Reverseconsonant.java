import java.util.*;
import java.io.*;
public class Reverseconsonant{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String w[]=s.split(" ");
for(int i=0;i<=w.length-1;i++){
char c=Character.toLowerCase(w[i].charAt(0));
if(c!='a'&& c!='e'&& c!='i'&& c!='o' && c!='u'){
for(int j=w[i].length()-1;j>=0;j--){
char  ch=w[i].charAt(j);
System.out.print(ch);
}

}
else{
System.out.print(w[i]);

}
System.out.print(" ");
}}}