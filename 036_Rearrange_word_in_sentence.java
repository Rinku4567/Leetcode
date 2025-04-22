import java.util.*;
class Solution {
    public String arrangeWords(String text) {
        String[] str=text.split(" ");

        for(int i=0;i<str.length;i++){
            for(int j=0;j<str.length-1;j++){
                if(str[j].length()>str[j+1].length()){
                    String temp=str[j];
                    str[j]=str[j+1];
                    str[j+1]=temp;
                }
                
            }

        }
            

        String s="";
        for(int i=0;i<str.length;i++){
           if(i==str.length-1){
                s=s+str[i];
            }else{
                s=s+str[i]+" ";
            }
        }
        s=s.toLowerCase();
        String s1=s.substring(0,1).toUpperCase();
        String s2=s.substring(1);
        String s3=s1+s2;
      



        //System.out.println(s3);
        return s3;
        
    }
    public static void main(String[] args) {
        Solution s1=new Solution();
        s1.arrangeWords("Leetcode is cool");
    }
}
