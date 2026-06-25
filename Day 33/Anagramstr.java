import java.util.*;
class Anagramstr{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String w[]=s.split(" ");//string into word array or string array 
int flag=0;//no anagram found
for(int i=0;i<w.length;i++)
{
for(int j=i+1;j<w.length;j++){
String s1=w[i];
String s2=w[j];
  
//check the length is equal or not 
if(s1.length()==s2.length()){
s1=s1.toLowerCase();
s2=s2.toLowerCase();
// converting to char array to sort the array
char ch1[]=s1.toCharArray();
char ch2[]=s2.toCharArray();
//sorting the array                                          
Arrays.sort(ch1);
Arrays.sort(ch2);
if(Arrays.equals(ch1,ch2)){//check the ele at each ind is same or not
System.out.println(s1+" : "+s2);
flag++;
}
}
}
}
if(flag==0){
System.out.println("NO ANAGRAM FOUND");
}}}