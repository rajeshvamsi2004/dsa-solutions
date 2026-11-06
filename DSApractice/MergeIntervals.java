import java.util.*;
class MergeIntervals
{
   public static void main(String[] args)
   {
       int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
       Arrays.sort(arr,(a,b) -> a[0]-b[0]);
       List<List<Integer>> result = new ArrayList<>();
       int start = arr[0][0];
       int end = arr[0][1];
       for(int i=1;i<arr.length;i++)
       {
          int nextstart = arr[i][0];
          int nextend = arr[i][1];
          if(end >= nextstart)
          {
             start = Math.min(start,nextstart);
             end = Math.max(end,nextend);
          }
          else
          {
             result.add(Arrays.asList(start,end));
             start = nextstart;
             end = nextend;
          }
       }
       result.add(Arrays.asList(start,end));
       System.out.println(result);
   }
}