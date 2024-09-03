class Solution {
    public int getLucky(String s, int k) {
         String s1="";
        for(int i=0;i<s.length();i++){
            int a=s.charAt(i);
            int ans=a-96;
            s1=s1+ans;
        }
       int ans1=0;
       int i=1;
       while(i<=k){
        int sum=0;
        char[] ch=s1.toCharArray();
        for(char j:ch){
            int a=(int)j-48;
            sum=sum+a;
         }
         ans1=sum;
            s1=String.valueOf(sum);
            i++;
       }
     
return ans1;
       
    }
}
