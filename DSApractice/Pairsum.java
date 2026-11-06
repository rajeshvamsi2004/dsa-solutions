import java.util.*;
class Pairsum
{
   public static void main(String[] args)
   {
      int[] arr = {2,7,11,15};
      int target = 9;
      HashMap<Integer,Integer> hm = new HashMap<>();
      for(int i=0;i<arr.length;i++)
      {
         int current = arr[i];
         if(hm.containsKey(target - arr[i]))
         {
            System.out.println((target-arr[i])+ "and" + current);
            break;
         }
         else
         {
            hm.put(current,1);
         }
      }
   }
}