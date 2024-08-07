class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int plus=(n*(n+1))/2;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];

        }
        int c=plus-sum;
        return c;


    }
    public static void main(String[] args) {
        Solution s1=new Solution();
        int[] arr={3,0,1};
        s1.missingNumber(arr);
    }

    
}
