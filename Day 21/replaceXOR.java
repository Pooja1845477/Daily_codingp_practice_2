class Solution {
    public void replaceElements(int[] arr) {
        // code here
        int n=arr.length;
        int temp[]=new int[n];
        for(int i=0;i<n;i++)
        temp[i]=arr[i];
        arr[0]=temp[0]^temp[1];
        for(int i=1;i<n-1;i++){
            arr[i]=temp[i-1]^temp[i+1];
        }
        arr[n-1]=temp[n-2]^temp[n-1];
    }
}