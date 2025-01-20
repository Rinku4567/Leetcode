import java.util.*;
class Solution {
  public List<List<Integer>> findWinners(int[][] matches) {
    HashSet<Integer> hs=new HashSet<>();
    HashSet<Integer> hs1=new HashSet<>();

 List<List<Integer>> al=new ArrayList<>();
 List<Integer> l1=new ArrayList<>();
    Arrays.sort(matches,(a,b)->Integer.compare(a[1],b[1]));

    for(int[] i:matches){
     hs.add(i[1]);
    }
    
    for(int[] i:matches){
      if(!hs.contains(i[0])){
      hs1.add(i[0]);
      }
     }

     for(int[] i:matches){
      l1.add(i[1]);
     }

     HashMap<Integer,Integer> hm=new HashMap<>();
     for(int i:l1){
      
      hm.put(i,hm.getOrDefault(i, 0)+1);
     }
     List<Integer> l2=new ArrayList<>();
     for(int i:l1){
      if(hm.get(i)==1){
        l2.add(i);
      }
     }
     
     ArrayList<Integer> l3=new ArrayList<>();
     for(int i:hs1){
      l3.add(i);
     }
     Collections.sort(l3);
     Collections.sort(l2);
     al.add(l3);
     al.add(l2);




 
      return al;
  }
 
}
