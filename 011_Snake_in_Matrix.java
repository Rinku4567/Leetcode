import java.util.*;
class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int i=0,j=0;
        for(String s:commands){
            switch (s) {
                case "UP":
                    if(i-1>=0){
                         i=i-1;
                    }
                   
                    break;
                    case "DOWN":
                    if(i+1<n){
                        i=i+1;
                   }
                    break;
                    case "LEFT":
                    if(j-1>=0){
                        j=j-1;
                   }
                    
                    break;
                    case "RIGHT":
                    if(j+1<n){
                        j=j+1;
                   }
                    break;
            
               
            }
        }
       // System.out.println((i*n)+j);
        return (i*n)+j;
    }
    public static void main(String[] args){
        Solution s1=new Solution();
        List<String> al=new ArrayList<>();
        al.add("RIGHT");
        al.add("DOWN");
        s1.finalPositionOfSnake(2,al);
    }
}
