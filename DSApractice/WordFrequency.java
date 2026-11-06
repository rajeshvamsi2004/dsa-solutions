import java.util.*;
class WordFrequency
{
   public static void main(String[] args)
   {
      String input = "the quick brown fox jumps over the lazy dog the fox runs";
      HashMap<String,Integer> hm = new HashMap<>();
      for(String s:input.split(" "))
      {
         if(hm.containsKey(s))
         {
             int count = hm.get(s);
             hm.put(s,count+1);
         }   
         else
         {
            hm.put(s,1);
         }
      }
      int maxlen = 0;
      int maxcount = 0;
      String bestword = "";
      for(String s:hm.keySet())
      {
         if(s.length() > maxlen)
         {
            maxlen = s.length();
         }
         int count = hm.get(s);
         if(count > maxcount ||(count==maxcount && s.compareTo(bestword) < 0))
         {
            maxcount = count;
            bestword = s;
         }
      }
      System.out.println(bestword);
      System.out.println(maxlen);
   }
}