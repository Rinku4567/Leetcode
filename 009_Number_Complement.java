class Solution {
    public int findComplement(int num) {
        String st="";
       
        while(num>0){
            st=st+num%2;
            num=num/2;
        }
        StringBuffer s=new StringBuffer(st);
        String s2=s.reverse().toString();
       int ans=0;
       int j=0;
      
        for(int i=s2.length()-1;i>=0;i--){
            if(s2.charAt(i)=='1'){
                ans=ans+((int)Math.pow(2,j)*0);
            }else{
                 ans=ans+((int)Math.pow(2,j)*1);
               // System.out.println(ans);
            }
            j++;
           
        }
       // System.out.println(ans);
        return ans;

        
    }
    public static void main(String[] args) {
        Solution s1=new Solution();
        s1.findComplement(1);
    }
}
