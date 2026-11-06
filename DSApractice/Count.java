import java.util.*;
class Count
{
   public static void main(String[] args)
   {
      int[] arr = {1,2,1,3,2,1};
      HashMap<Integer,Integer> hm = new HashMap<>();
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
      for(int key:hm.keySet())
      {
         System.out.println(+key + "->" +hm.get(key));
      }
   }
}