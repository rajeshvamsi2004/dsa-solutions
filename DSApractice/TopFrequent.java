import java.util.*;
class TopFrequent
{
   public static void main(String[] args)
   {
      int[] arr = {1,1,1,2,2,3};
      List<Integer> list = new ArrayList<>();
      int k=2;
      HashMap<Integer,Integer> hm = new HashMap<>();
      for(int i=0;i<arr.length;i++)
      {
         int current = arr[i];
         if(hm.containsKey(current))
         {
            int count = hm.get(current);
            hm.put(current,count+1);
         }
         else
         {
            hm.put(current,1);
         }
      }
      PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> hm.get(b) - hm.get(a));
      pq.addAll(hm.keySet());
      for(int i=0;i<k;i++)
      {
         list.add(pq.poll());
      }
      System.out.println(list);
   }
}