import java.util.*;
public class Swap
{
   public static void main(String[] args)
   {
      int[] arr = {1,-2,3,4,-1,2};
      int k=1;
      int maxsum = Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++)
      {
         for(int j=i;j<arr.length;j++)
         {
             PriorityQueue<Integer> pq1 = new PriorityQueue<>();
             PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
             for(int idx=0;idx<arr.length;idx++)
             {
                if(idx>=i && idx <= j)
                {
                   pq1.add(arr[idx]);
                }
                else
                {
                  pq2.add(arr[idx]);
                }
             }
             int swaps = 0;
             while(k < swaps && !pq1.isEmpty() && !pq2.isEmpty())
             {
                  int small = pq1.peek();
                  int large = pq2.peek();
                  if(large > small)
                  {
                     pq1.poll();
                     pq2.poll();
                     pq1.add(large);
                     swaps++;
                  }
                  else
                  {
                     break;
                  }
             }
             int currentsum = 0;
             while(!pq1.isEmpty())
             {
                currentsum = currentsum+pq1.poll();
             }
             maxsum = Math.max(maxsum,currentsum);
         }
      }
      System.out.println(maxsum);
   }
}