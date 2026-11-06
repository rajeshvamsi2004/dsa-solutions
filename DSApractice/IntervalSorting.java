import java.util.*;
class IntervalSorting
{
   public static void main(String[] args)
   {
      int[][] arr = {{1,4},{2,3},{4,6},{8,9},{3,5},{10,12}};
      Arrays.sort(arr,(a,b) -> a[1] - b[1]);
      int start = arr[0][0];
      int end = arr[0][1];
      int count=1;
      for(int i=1;i<arr.length;i++)
      {
         int nextstart = arr[i][0];
         int nextend = arr[i][1];
         if(end >= nextstart)
         {
            count++;
            end = nextend;
         }
      }
      System.out.println(count);
   }
}