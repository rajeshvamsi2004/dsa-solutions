import java.util.*;
class Maxsub
{
   public static void main(String[] args)
   {
      int[] arr = {4, 2, 12, 3, 8, 7, 9, 1};
      List<Integer> result = new ArrayList<>();
      int k=4;
      int maxele = Integer.MIN_VALUE;
      int count=0;
      int left = 0;
      for(int right=0;right<arr.length;right++)
      {
          count++;
          if(arr[right] > maxele)
          {
             maxele = arr[right];
          }
          if(count == k)
          {
             result.add(maxele);
             maxele = Integer.MIN_VALUE;
             count--;
             left++;
             int temp = left;
             while(temp <= right)
             {
                if(arr[temp] > maxele)
                {
                    maxele = arr[temp];
                }
                temp++;
             }
          }
      }
      System.out.println(result);
   }
}