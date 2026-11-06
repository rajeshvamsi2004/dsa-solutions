import java.util.*;
class LongestSequence
{
   public static void main(String[] args) {
      int[] arr = {100,4,200,1,3,2};
      HashSet<Integer> hs = new HashSet<>();
      for(int i=0;i<arr.length;i++)
      {
         int current = arr[i];
         hs.add(current);
      }
      int maxlen = 0;
      for(int key:hs)
      {
          if(!hs.contains(key-1))
          {
              int current = key;
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