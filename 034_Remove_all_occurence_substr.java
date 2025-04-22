class Solution {
    public String removeOccurrences(String s, String part) {
        String s1=s;
        StringBuilder sb=new StringBuilder(s);
        
        for(int i=0;i<s1.length();i++){
            //System.out.println("RInku");
            for(int j=i+1;j<s1.length()+1;j++){
            String sub=s1.substring(i,j) ;
           // System.out.println(sub);
            if(sub.equals(part)){
                sb.delete(i,j);
                s1=sb.toString();
                i=-1;
                break;
            }
           
            }

        }
        return sb.toString();
    }
}
