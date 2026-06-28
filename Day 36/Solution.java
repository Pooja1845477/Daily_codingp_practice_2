import java.util.*;
import java.io.*;
public class Solution{
public static void main(String args[]){
Scanner sc=new Scanner(System.in); 
String s=sc.nextLine().toLowerCase();
boolean seenb=false; 
boolean valid=true;
for(int i=0;i<s.length();i++){
char ch=s.charAt(i);


if(ch=='b')
seenb=true;
else if(ch=='a' && seenb){
valid=false;
break;

}
}
System.out.print(valid);
}
}
