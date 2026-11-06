import java.util.*;
class Ktarget
{
   public static void main(String[] args)
   {
       int[] arr = {4, -1, 2, 1, -5, 4, 3};
       int k=6;
       int sum=0;
       HashMap<Integer,Integer> hm = new HashMap<>();
       hm.put(0,-1);
       int maxlen = 0;
       for(int i=0;i<arr.length;i++)
       {
           sum = sum+arr[i];
           if(hm.containsKey(sum-k))
           {
              maxlen = Math.max(maxlen,i-hm.get(sum-k));
           }
           if(!hm.containsKey(sum))
           {
              hm.put(sum,i);
           }
       }
       System.out.println(maxlen);
   }
}