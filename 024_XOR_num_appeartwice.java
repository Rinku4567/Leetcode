import java.util.*;
class Solution {
  public int duplicateNumbersXOR(int[] nums) {
    int ans=0;
    int con=0;
      Arrays.sort(nums);
      for(int i=0;i<nums.length-1;i++){
        if(nums[i]==nums[i+1]){
          ans=con^nums[i];
          
          con=ans;
        }
      }
      //System.out.println(ans);
      return ans;
  }
  
}
