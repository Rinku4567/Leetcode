class Solution {
    public static void rev(int[] nums,int i,int j){
        while(i<j){

            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

    }
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        rev(nums,0,nums.length-1);
        rev(nums,0,k-1);
        rev(nums,k,nums.length-1);
    }
    public static void main(String[] args) {
        Solution s1=new Solution();
        int[] arr={1,2,3,4,5,6,7};
        s1.rotate(arr,3);
    }
}
