class Solution {
    public int longestPalindrome(String s) {
      char ch[]=s.toCharArray();
      int count[]=new int[128];

      for(char i:ch){
        count[i]++;
      }
int res=0;
      for(int i=0;i<count.length;i++){
        int val=count[i];
        res=res+(val/2)*2;
        if(res%2==0 && val%2==1){
          res++;
        }
      }
      
        return res;
    }
   
}
