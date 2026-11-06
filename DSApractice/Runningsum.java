import java.util.*;
class Runningsum
{
   public static void main(String[] args)
   {
      int[] arr = {1,1,1};
      HashMap<Integer,Integer> hm = new HashMap<>();
      int sum=0;
      int countsub = 0;
      hm.put(0,1);
      for(int i=0;i<arr.length;i++)
      {
         int current = arr[i];
         int k=2;
         sum = sum+arr[i];
         if(hm.containsKey(sum-k))
         {
            countsub = countsub+hm.get(sum-k);
         }
         if(hm.containsKey(sum))
         {
            int count = hm.get(sum);
            hm.put(sum,count+1);
         }
         else
         {
            hm.put(sum,1);
         }
      }
      System.out.println(countsub);
   }
}