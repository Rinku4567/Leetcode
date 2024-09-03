class Solution {
    public int passThePillow(int n, int time) {
        int dir=1;
        int i=1;
        int j=1;
       while(j<=time){
        if(dir==1){
                i++;
        }else{
                i--;
        }

        if(i==n){
            dir=-1;
        }
        if(i==1){
            dir=1;
        }
j++;

       }
       return i;
    }
}
