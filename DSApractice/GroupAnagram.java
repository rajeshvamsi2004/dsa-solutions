import java.util.*;
class GroupAnagram
{
   public static void main(String[] args)
   {
      String[] arr = {"eat","tea","tan","ate","nat","bat"};
      HashMap<String,List<String>> hm = new HashMap<>();
      List<List<String>> list = new ArrayList<>();
      for(String s:arr)
      {
         char[] wordarr = s.toCharArray();
         Arrays.sort(wordarr);
         String sorted = new String(wordarr);
         if(hm.containsKey(sorted))
         {
            hm.get(sorted).add(s);
         }
         else
         {
             List<String> temp = new ArrayList<>();
             temp.add(s);
             hm.put(sorted,temp);
         }
      }
      for(String s:hm.keySet())
      {
         list.add(hm.get(s));
      }
      System.out.println(list);
   }
}