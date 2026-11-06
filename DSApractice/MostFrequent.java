import java.util.*;
class MostFrequent
{
   public static void main(String[] args)
   {
      String s = "banana";
      HashMap<Character,Integer> hm = new HashMap<>();
      for(int i=0;i<s.length();i++)
      {
         char curr = s.charAt(i);
         if(hm.containsKey(curr))
         {
            int count = hm.get(curr);
            hm.put(curr,count+1);
         }
         else
         {
            hm.put(curr,1);
         }
      }
      int maxcount = Integer.MIN_VALUE;
      char ele = ' ';
      for(int i=0;i<s.length();i++)
      {
         char current = s.charAt(i);
         if(hm.get(current) > maxcount)
         {
            ele = current;
            maxcount = hm.get(current);
         }
      }
      System.out.println(ele);
   }
}