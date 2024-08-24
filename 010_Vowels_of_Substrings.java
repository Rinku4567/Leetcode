class Solution {

    public long countVowels(String s){
      long ans=0;
  char[] ch=s.toCharArray();
  int n=s.length();

  for(int i=0;i<n;i++){
    if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
            long l=n-i;
            ans=ans+l*i+l;
    }
  }
//System.out.println(ans);
          return ans;
        }
        
    
    public static void main(String[] args) {
      Solution s1=new Solution();
      s1.countVowels("aba");
    }
  }
