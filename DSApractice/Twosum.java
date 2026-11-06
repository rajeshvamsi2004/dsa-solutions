import java.util.*;
class Twosum
{
   public static void main(String[] args)
   {
      int[] arr = {2,7,11,15};
      HashMap<Integer,Integer> hm = new HashMap<>();
      int target = 9;
      for(int i=0;i<arr.length;i++)
      {
          int current = arr[i];
          int complement = target - arr[i];
          if(hm.containsKey(complement))
          {
              System.out.println("The indexes are : " + hm.get(complement) + "," + i);
              break;
          }
          else
          {
             hm.put(current,i);
          }
      }
   }
}