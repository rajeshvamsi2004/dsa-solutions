import java.util.*;
class Unique
{
   public static void main(String[] args)
   {
      int[] arr = {3,2,1,2,1,7};
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      for(int i=0;i<arr.length;i++)
      {
          pq.add(arr[i]);
      }
      int operations = 0;
      while(!pq.isEmpty())
      {
         int current = pq.poll();
         if(!pq.isEmpty() && current == pq.peek())
         {
            pq.add(current+1);
            operations = operations+1;
         }
      }
      System.out.println(operations);
   }
}