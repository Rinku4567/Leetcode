import java.util.*;
class Solution {
  public List<List<Integer>> fourSum(int[] nums, int target) {
    Arrays.sort(nums);
    Set<List<Integer>> hs=new HashSet<>();
   
    if(nums.length<4) {
      return new ArrayList<>();
    }
     for(int i=0;i<nums.length-3;i++){
      for(int j=i+1;j<nums.length-2;j++){
      int k=j+1;
    int l=nums.length-1;
    while(k<l){
    long sum=(long)nums[i]+nums[j]+nums[k]+nums[l];
      
      if(sum==target){
        hs.add(Arrays.asList(nums[i],nums[j],nums[k],nums[l]));
                  k++;
                  l--;
      }
      else if(sum<target){
        k++;
      }
      else if(sum>target){
              l--; 
      }
    }
      
  }
}
  List<List<Integer>> al=new ArrayList<>(hs);
 // System.out.println(al);
 
       return al;
  }
  public static void main(String[] args) {
    Solution s1=new Solution();
    int[] arr={100000000,100000000,100000000,100000000};
    s1.fourSum(arr,0);  
  }
}
  
