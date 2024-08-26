class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
       
       
        int[] arr=new int[queries.length];
        for(int i=0;i<queries.length;i++){
           int k=queries[i][1];
           nums[k]=nums[k]+queries[i][0];
            int sum=0;

            for(int j=0;j<nums.length;j++){
                if(nums[j]%2==0){
                    sum=sum+nums[j];
                }
            }
           arr[i]=sum;
          
         
        }

        
        return arr;
    }
    public static void main(String[] args) {
        Solution s1=new Solution();
        int[] arr={1,2,3,4};
        int[][] arr1={{1,0},{-3,1},{-4,0},{2,3}};
        s1.sumEvenAfterQueries(arr, arr1);
    }
}
