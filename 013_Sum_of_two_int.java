class Solution {
    public int getSum(int a, int b) {
        if(a<0 && b<0){
          int min=Math.min(a,b);
        int max=Math.max(a,b);
        int ans=-(max);

         for(int i=1;i<=ans;i++){
            min--;
        }

return min;
        }
        int min=Math.min(a,b);
        int max=Math.max(a,b);
        for(int i=1;i<=max;i++){
            min++;
        }
        return min;
    }
}
