class Solution {
public void reverseString(char[] s) {
char[] arr=new char[s.length];
System.arraycopy(s,0,arr,0,s.length);
int j=0;
for(int i=s.length-1;i>=0;i--){
s[i]=arr[j];
j++;
}
}
}
