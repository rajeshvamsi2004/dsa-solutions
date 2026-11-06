import java.util.*;
class Sequencelongest
{
   public static void main(String[] args)
   {
      int[] arr = {10, 5, 12, 6, 3, 7, 4, 20};
      int maxcount=0;
      HashSet<Integer> hs = new HashSet<>();
      for(int i=0;i<arr.length;i++)
      {
          hs.add(arr[i]);
      }
      for(int i=0;i<arr.length;i++)
      {
         int current = arr[i];
         int count=1;
         if(!hs.contains(current-1))
         {
              while(hs.contains(current+1))
              {
                  current = current+1;
                  count++;
              }
         }
         maxcount = Math.max(maxcount,count);
      }
      System.out.println(maxcount);
   }
}