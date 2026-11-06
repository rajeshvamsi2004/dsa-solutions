import java.util.*;
class Jobs
{
   public static void main(String[] args)
   {
      int[][] arr = {{1,40},{1,30},{4,20},{1,10}};
      Arrays.sort(arr,(a,b) -> b[1]-a[1]);
      boolean[] visited = new boolean[arr.length];
      int profitsum = 0;
      int maxdeadline=0;
      for(int i=0;i<arr.length;i++)
      {
         maxdeadline = Math.max(maxdeadline,arr[i][0]);
      }
      for(int i=0;i<arr.length;i++)
      {
         int deadline = arr[i][0];
         int profit = arr[i][1];
         for(int j=)
      }
      System.out.println(profitsum);
   }
}