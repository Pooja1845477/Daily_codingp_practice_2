
import java.util.*;

public class pairwithdiffsum {
 
    public int sumDiffPairs(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int sum=0;
        int i=n-1;
       while(i>0){
          if(arr[i]-arr[i-1]<k){
              sum+=arr[i]+arr[i-1];
              i-=2;
          }  
          else{
              i--;
          }
        }
        return sum;
    }
} 

