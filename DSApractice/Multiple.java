import java.util.*;
class Multiple
{
   public static void main(String[] args)
   {
      int[] arr = {1,3,4,2,2};
      HashSet<Integer> hs = new HashSet<>();
      for(int i=0;i<arr.length;i++)
      {
         int current = arr[i];
         if(hs.contains(current))
         {
            System.out.println(current);
            break;
         }
         else
         {
            hs.add(current);
         }
      }
   }
}