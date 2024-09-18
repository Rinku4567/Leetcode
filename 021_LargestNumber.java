import java.math.BigInteger;
class Solution {
    public String largestNumber(int[] nums) {
        int count=1;
        while(count>0){
            int cnt=0;
        for(int i=0;i<nums.length-1;i++){
           int j=i+1;
            String s1=String.valueOf(nums[i]);
            String s2=String.valueOf(nums[j]);
            String s3=s1+s2;
            String s4=s2+s1;
            BigInteger a = new BigInteger(s3);
            BigInteger b = new BigInteger(s4);
           // System.out.println(a);
            //System.out.println(b);
            int r=a.compareTo(b);
            if(r==-1){
               int temp=nums[i];
               nums[i]=nums[j];
               nums[j]=temp;
               cnt++;
            }
            
        } 
       
         count=cnt;   
        }
        String str="";
        int count1=0;
        for(int l:nums){
            if(l==0){
                count1++;
            }
           
        }
        if(count1==nums.length){
          // System.out.println(0);
            return str="0";
        }
        for(int l:nums){
    
            str=str+l;
        }
        System.out.println(str);
        
    
        return str;
      }
