import java.util.*;
class Missingrepeat
{
   public static void main(String[] args)
   {
      int[] arr = {3,1,3,4,5};
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
      int duplicate = 0;
      for(int i=0;i<arr.length;i++)
      {
          int current2 = arr[i];
          if(hm.get(current2) > 1)
          {
             duplicate = current2;
          }
      }
      int sum = 0;
      for(int i=0;i<arr.length;i++)
      {
         sum = sum+arr[i];
      }
      int Missing = (arr.length * (arr.length+1)/2) - (sum-duplicate);
      System.out.println("Duplicate number is : " + duplicate);
      System.out.println("Missing number is : " + Missing);
   }
}