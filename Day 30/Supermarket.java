import java.util.*;
import java.io.*;
public class Supermarket{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();// no.of items
double total=0;
for(int i=0;i<n;i++){
int price=sc.nextInt();
int qty=sc.nextInt();
int free_item=qty/3;
int payable_qty=qty-free_item;
total+=payable_qty*price;
}
double total_bill=0;
double final_bill=0;
if(total>5000)
{
total_bill=total-(total*0.15);
final_bill+=total_bill+(total_bill*0.05);
}
else if(total>2000)
{
total_bill=total-(total*0.10);
final_bill+=total_bill+(total_bill*0.05);

}
else{
final_bill+=total_bill+(total_bill*0.05);

}
System.out.print(final_bill);
}
}
