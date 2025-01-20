import java.util.*;
class Solution{
public int heightChecker(int[] heights){

int[] arr1=new int[heights.length];
System.arraycopy(heights,0,arr1,0,heights.length);
Arrays.sort(heights);
int count=0;

for(int i=0;i<arr1.length;i++){
if(arr1[i]!=heights[i]){
count++;
}
}
return count;

}


}
