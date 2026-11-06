import java.util.*;
class Mergenewinterval
{
   public static void main(String[] args)
   {
        int[][] arr = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        List<int[]> result = new ArrayList<>();
        int[] newInterval = {4,8};
        int start = newInterval[0];
        int end = newInterval[1];
        for(int i=0;i<arr.length;i++)
        {
            int currentstart = arr[i][0];
            int currentend = arr[i][1];
            if(currentend < start)
            {
                result.add(new int[]{currentstart,currentend});
            }
            else if(currentend >= start && currentstart <= end)
            {
                start = Math.min(start,currentstart);
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