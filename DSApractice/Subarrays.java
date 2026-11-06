import java.util.*;
class Subarrays
{
   public static void main(String[] args)
   {
      int[] arr = {3,1,2,4};
      List<Integer> list = new ArrayList<>();
      for(int i=0;i<arr.length;i++)
      {
          for(int j=i;j<arr.length;j++)
          {
             int minele = Integer.MAX_VALUE;
             for(int k=i;k<=j;k++)
             {
                 if(arr[k] < minele)
                 {
                    minele = arr[k];
                 }
             }
             list.add(minele);
          }
      }
      int sum = 0;
      for(int i=0;i<list.size();i++)
      {
          sum = sum + list.get(i);
      }
      System.out.println(sum);
   }
}