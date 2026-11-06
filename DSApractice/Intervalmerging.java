import java.util.*;
class Intervalmerging
{
   public static void main(String[] args)
   {
      int[][] arr = {
          {1,3},
          {2,6},
          {8,10},
          {15,18}
      };
      List<int[]> result = new ArrayList<>();
      Arrays.sort(arr,(a,b) -> a[0]-b[0]);
      int start = arr[0][0];
      int end = arr[0][1];
      for(int i=1;i<arr.length;i++)
      {
         int nextstart = arr[i][0];
         int nextend = arr[i][1];
         if(end > nextstart)
         {
            end = Math.max(end,nextend);
         }
         else
         {
            result.add(new int[] {start,end});
            start = nextstart;
            end = nextend;
         }
      }
      result.add(new int[] {start,end});
      for(int[] interval:result)
      {
         System.out.println(Arrays.toString(interval));
      }
   }
}