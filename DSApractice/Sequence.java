import java.util.*;
class Sequence
{
    public static void main(String[] args)
    {
      int[] arr = {100,4,200,1,3,2};
      HashSet<Integer> hs = new HashSet<>();
      int maxlen = Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++)
      {
         hs.add(arr[i]);
      }
      for(int i=0;i<arr.length;i++)
      {
          int current = arr[i];
          if(!hs.contains(current-1))
          {
              int len = 1;
              while(hs.contains(current+1))
              {
                 current++;
                 len++;
              }
              maxlen = Math.max(maxlen,len);
          }
      }
      System.out.println(maxlen);
   }
}