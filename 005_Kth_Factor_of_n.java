import java.util.*;
class Solution {
    public int kthFactor(int n, int k) {
        int count=0;
       for(int i=1;i<=n;i++){
           if(n%i==0){
               count++;
               }

       }
       int[] arr1=new int[count];
       int l=0;
       for(int i=1;i<=n;i++){
           if(n%i==0){
               arr1[l]=i;
               l++;
               }

       }
       Arrays.sort(arr1);
       if(count<k){
           return -1;
       }
       else{
           return arr1[k-1];
       }
       
    }
    public static void main(String[] args){
        Solution s1=new Solution();
        s1.kthFactor(12,3);

    }
}
