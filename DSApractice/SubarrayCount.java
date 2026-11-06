import java.util.*;
class SubarrayCount
{
   public static void main(String[] args)
   {
      int[] arr = {1,2,3};
      int k=2;
      int countarr = 0;
      int sum = 0;
      HashMap<Integer,Integer> hm = new HashMap<>();
      hm.put(0,1);
      for(int i=0;i<arr.length;i++)
      {
         sum = sum + arr[i];
         if(hm.containsKey(sum-k))
         {
            countarr = countarr + hm.get(sum-k);
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
      System.out.println(countarr);
   }
}