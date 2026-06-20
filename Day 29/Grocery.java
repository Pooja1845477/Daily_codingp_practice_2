import java.util.*;
import java.io.*;
public class Grocery{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();// no.of items
double total=0;
for(int i=0;i<n;i++){
int price=sc.nextInt();
int qty=sc.nextInt();
total+=price*qty;
}
double total_bill=0;
if(total>5000)
{
total_bill=total-(total*0.20);
}
else if(total>2000)
{
total_bill=total-(total*0.10);
}
else{
total_bill=total;
}
System.out.print(total_bill);
}
}

