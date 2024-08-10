class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
int max=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i;j<nums.length;j++)
            if(nums[j]==1){
                count++;
            }
            else {
                break;
        }
        max=Math.max(max,count);
    }
   // System.out.println(max);
    return max;
}
    //485
    public static void main(String[] args) {
        Solution s1=new Solution();
        int[] arr={1,1,0,1,1,1};
        s1.findMaxConsecutiveOnes(arr);
    }
}
