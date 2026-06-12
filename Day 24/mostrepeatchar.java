import java.util.*;
class mostrepeatchar{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
int a[]=new int[256];

//to print the freq of enterexd elements 
for(int i=0;i<s.length();i++){
char ch=s.charAt(i); 
a[ch]++;
}

int maxfreq=0;
char maxchar=' ';
//boolean print[]=new boolean[256];
//false-- b[0]=f   b[65]=f



for(int    i=0;i<256;i++){
if(a[i]>0){
System.out.println((char)i+" "+a[i]);
}
if(a[i]>maxfreq){
maxfreq=a[i];
maxchar=(char)i;
}
}
System.out.println(maxchar+ " : " +maxfreq);
}
}