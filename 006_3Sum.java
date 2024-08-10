import java.util.*;
class Solution {
    public  List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
      Set<List<Integer>> hs=new HashSet<>();
     
      if(nums.length<3) {
        return new ArrayList<>();
      }
       for(int i=0;i<nums.length-2;i++){
        int j=i+1;
      int k=nums.length-1;
      while(j<k){
        int sum=nums[i]+nums[j]+nums[k];
        
        if(sum==0){
          hs.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
        }
        else if(sum<0){
          j++;
        }
        else if(sum>0){
                  k--;  
        }
      }
        
    }
    List<List<Integer>> al=new ArrayList<>(hs);
    //System.out.println(al);
   
         return al;
    }
    public static void main(String[] args) {
      Solution s1=new Solution();
      int[] arr={0,1,1};
      s1.threeSum(arr);  
    }
}
