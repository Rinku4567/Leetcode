class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        int a=0;
        int i=0;
        while(i<chalk.length){
                if(k>=chalk[i]){
                    k=k-chalk[i];
                   
                }else{
                    a=i;
                    break;
                }
                i++;
                if(i<chalk.length){
                    i=i; 
                }else{
                    i=0;
                }
                
        }
        
        //System.out.println(a);
        return a;
   
    }
}
