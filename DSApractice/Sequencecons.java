import java.util.*;
class Sequencecons
{
   public static void main(String[] args) {
       int[] arr = {10,5,12,3,4,11,2};
       HashSet<Integer> hs = new HashSet<>();
       for(int i=0;i<arr.length;i++)
       {
          hs.add(arr[i]);
       }
       int maxlen = 0;
       for(int i=0;i<arr.length;i++)
       {
          int current = arr[i];
          if(!hs.contains(current-1))
          {
              int len=1;
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