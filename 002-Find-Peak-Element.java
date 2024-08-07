
class Solution {
    public int findPeakElement(int[] nums) {
        int index=0;
        if(nums.length==1){
            index=0;
        }
        else if(nums.length==2){
            if(nums[0]>nums[1]){
                index=0;
            }
            else{
                index=1;
            }
        }
        else{
        for(int i=0;i<nums.length;i++){
            if(i!=0 && i!=nums.length-1){
                 if(nums[i]>nums[i-1] && nums[i]>nums[i+1]){
                   index=i;
                 }
                 
            }
            else if(i>=0 && i<nums.length){
                int max=nums[0];
                for(int k=0;k<nums.length;k++){
                     if(nums[k]>max){
                        max=nums[k];
                        index=k;

                     }
                }
            }
        }

       
    }
        
       return index; 
    
   
    }
    public static void main(String[] args) {
        Solution s1=new Solution();
        int[] arr={1,2,3,4};
        s1.findPeakElement(arr);
       //System.out.println(ans);
        
    }
}
