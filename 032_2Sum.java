class Solution {

    public int[] twoSum(int[] nums, int target) {
        int[] arr1=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j){
            if(nums[i]+nums[j]==target){
              arr1[k]=i;
              arr1[k+1]=j;
            }
            }
        }
        }
        return arr1;
    }
   
    public static void main(String[] args){
        Solution s1=new Solution();
        int[] arr={2,7,11,15};
        int tar=9;
        s1.twoSum(arr,tar);
    }
}
