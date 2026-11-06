import java.util.*;
class MergeInterval
{
   public static void main(String[] args)
   {
      int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
      Arrays.sort(arr, (a,b) -> a[0] - b[0]);
      int start = arr[0][0];
      int end = arr[0][1];
      List<int[]> result = new ArrayList<>();
      for(int i=1;i<arr.length;i++)
      {
          int currentstart = arr[i][0];
          int currentend = arr[i][1];
          if(currentstart < end)
          {
             end = Math.max(end,currentend);
          }
          else
          {
             result.add(new int[]{start,end});
             start = currentstart;
             end = currentend;
          }
      }
      result.add(new int[]{start,end});
      for(int[] val:result)
      {
          System.out.println(val[0] + "," + val[1]);
      }
   }
}