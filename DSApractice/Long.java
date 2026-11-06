import java.util.*;
class Long
{
   public static void main(String[] args)
   {
      int[] arr = {1,2,3,2,1,4,5};
      HashMap<Integer,Integer> hm = new HashMap<>();
      int left=0;
      int maxlen=0;
      for(int right=0;right<arr.length;right++)
      {
          int current = arr[right];
          while(hm.containsKey(current))
          {
             hm.put(arr[left],hm.get(arr[left])-1);
             if(hm.get(arr[left]) == 0)
             {
                hm.remove(arr[left]);
             }
             left++;
          }
          hm.put(current,1);
          maxlen = Math.max(maxlen,right-left+1);
      }
      System.out.println(maxlen);
   }
}