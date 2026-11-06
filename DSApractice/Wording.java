import java.util.*;
class Wording 
{
   public static void main(String[] args)
   {
      String s = "pwwkew";
      HashMap<Character,Integer> hm = new HashMap<>();
      int left=0;
      int maxlen=0;
      for(int right=0;right<s.length();right++)
      {
         char current = s.charAt(right);
         while(hm.containsKey(current))
         {
             hm.put(s.charAt(left),hm.get(s.charAt(left))-1);
             if(hm.get(s.charAt(left)) == 0)
             {
                hm.remove(s.charAt(left));
             }
             left++;
         }
         hm.put(current,1);
         maxlen = Math.max(maxlen,right-left+1);
      }
      System.out.println(maxlen);
   }
}