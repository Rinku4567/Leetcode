import java.util.Arrays;
class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int ans=nums[1]-nums[0];
        int a=0;

        for(int i=0;i<=nums.length-2;i++){
            int min=Math.min(ans,nums[i+1]-nums[i]);
            ans=min;
        }
       // System.out.println(a);
        return ans;
    }
    public static void main(String[] args) {
        Solution s1=new Solution();
        int[] arr={100,1,10};
        s1.findValueOfPartition(arr);
    }
}
