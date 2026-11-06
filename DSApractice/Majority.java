import java.util.*;
class Majority
{
   public static void main(String[] args)
   {
      HashMap<Integer,Integer> hm = new HashMap<>();
      int[] arr = {2,2,1,1,1,2,2};
      for(int i=0;i<arr.length;i++)
      {
         int current = arr[i];
         if(hm.containsKey(current))
         {
            int count = hm.get(current);
            hm.put(current,count+1);
         }
         else
         {
            hm.put(current,1);
         }
      }
      for(int i=0;i<arr.length;i++)
      {
         int current = arr[i];
         if(hm.get(current) > arr.length/2)
         {
            System.out.println(current);
            break;
         }
      }
   }
}