import java.util.*;
class LongestSub
{
    public static void main(String[] args)
    {
        String s="abcabcbb";
        int left = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        int maxlen = 0;
        for(int right=0;right<s.length();right++)
        {
            char current = s.charAt(right);
            if(hm.containsKey(current))
            {
               left = Math.max(left,hm.get(current)+1);
            }
            hm.put(current,right);
            maxlen = Math.max(maxlen,right-left+1);

        }
        System.out.println(maxlen);
    }
}