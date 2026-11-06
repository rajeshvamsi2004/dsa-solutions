import java.util.*;
class Divisible
{
   public static void main(String[] args)
   {
      int[] arr = {4,5,0,-2,-3,1};
      int sum=0;
      int k=5;
      int countsu=0;
      HashMap<Integer,Integer> hm = new HashMap<>();
      hm.put(0,1);
      for(int i=0;i<arr.length;i++)
      {
         sum = sum + arr[i];
         int rem = ((sum%k)+k)%k;
         if(hm.containsKey(rem))
         {
            countsu = countsu+hm.get(rem);
         }
         if(hm.containsKey(rem))
         {
            int count = hm.get(rem);
            hm.put(rem,count+1);
         }
         else
         {
           hm.put(rem,1);
         }
      }
      System.out.println(countsu);
   }
}