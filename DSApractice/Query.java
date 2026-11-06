import java.util.*;
class Query
{
   public static void main(String[] args)
   {
      int[] arr = {1,2,3,4,5};
      int[][] queries = {
         {1,0,2},
         {2,1,10},
         {1,0,2}
      };
      List<Integer> result = new ArrayList<>();
      for(int i=0;i<queries.length;i++)
      {
          int type = queries[i][0];
          if(type == 1)
          {
             int index1 = queries[i][1];
             int index2 = queries[i][2];
             int sum = 0;
             for(int v=index1;v<=index2;v++)
             {
                 sum = sum + arr[v];
             }
             result.add(sum);
          }
          else
          {
              int idx = queries[i][1];
              int val = queries[i][2];
              arr[idx] = val;
          }
      }
      System.out.println(result);
   }
}