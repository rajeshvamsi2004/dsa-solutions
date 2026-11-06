import java.util.*;
class LongestSubstring
{
   public static void main(String[] args)
   {
      String s = "abcabcbb";
      HashMap<Character,Integer> hm = new HashMap<>();
      int left = 0;
      int maxlen = 0;
      for(int right=0;right<s.length();right++)
      {
          char current = s.charAt(right);
          if(hm.containsKey(current))
          {
             left = Math.max(left,hm.get(current) + 1);
          }
          hm.put(current,right);
          maxlen = Math.max(maxlen,right-left+1);
      }
      System.out.println(maxlen);
   }
}