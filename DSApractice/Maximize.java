import java.util.*;
class Maximize
{
   public static int maximum(int[] arr,int k)
   {
      PriorityQueue<Integer> pq = new PriorityQueue<>();
      for(int i=0;i<arr.length;i++)
      {
          pq.add(arr[i]);
      }
      for(int i=0;i<k;i++)
      {
         int currentmin = pq.poll();
         pq.add(currentmin+1);
      }
      int product=1;
      while(!pq.isEmpty())
      {
         product = product*pq.poll();
      }
      return product;
   }
   public static void main(String[] args)
   {
      int[] arr = {2,4};
      int k=3;
      System.out.println(maximum(arr, k));
   }
}