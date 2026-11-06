import java.util.*;
class LongestRepeating
{
   public static void main(String[] args)
   {
       String s = "abcabcbb";
       HashMap<Character,Integer> hm = new HashMap<>();
       int left=0;
       int maxlen = Integer.MIN_VALUE;
       for(int right=0;right<s.length();right++)
       {
           char current = s.charAt(right);
           if(hm.containsKey(current))
           {
              int count = hm.get(current);
              hm.put(current,count+1);
           }
           else
           {
              hm.put(current,1);
           }
           while(hm.get(current) > 1)
           {
              char leftchar = s.charAt(left);
              if(hm.get(leftchar) >= 1)
              {
                  hm.put(leftchar,hm.get(leftchar)-1); 
              }
              if(hm.get(leftchar) == 0)
              {
                 hm.remove(leftchar);
              }
              left++;
           }
           maxlen = Math.max(maxlen,right-left+1);
       }
       System.out.println(maxlen);

   }
}