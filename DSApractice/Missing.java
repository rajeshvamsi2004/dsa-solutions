import java.util.*;
class Missing
{
   public static void main(String[] args)
   {
      int[] arr = {3,0,1};
      HashSet<Integer> hs = new HashSet<>();
      for(int i=0;i<arr.length;i++)
      {
         int current = arr[i];
         hs.add(current);
      }
      int Missing = -1;
      for(int i=0;i<=arr.length;i++)
      {
         if(!hs.contains(i))
         {
            Missing = i;
            break;
         }
      }
      System.out.println("Missing Number is : " + Missing);
   }
}