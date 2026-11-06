import java.util.*;
class LongestSubarray
{
   public static void main(String[] args)
   {
      int[] arr = {1,2,1,3,4};
      int k=3;
      HashMap<Integer,Integer> hm = new HashMap<>();
      int left=0;
      int maxlen = 0;
      for(int right=0;right<arr.length;right++)
      {
         int current = arr[right];
         if(hm.containsKey(current))
         {
            int count = hm.get(current);
            hm.put(current,count+1);
         }
         else
         {
            hm.put(current,1);
         }
         while(hm.size() > k)
         {
            int leftremo = hm.get(arr[left]);
            hm.put(arr[left],leftremo-1);
            if(hm.get(arr[left]) == 0)
            {
               hm.remove((arr[left]));
            }
            left++;
         }
         maxlen = Math.max(maxlen,right-left+1);
      }
      System.out.println(maxlen);
   }
}