import java.util.*;
class GroupAnagrams
{
   public static void main(String[] args)
   {
       String[] words = {"eat","tea","tan","ate","nat","bat"};
       HashMap<String,List<String>> hm = new HashMap<>();
       for(int i=0;i<words.length;i++)
       {
          String current = words[i];
          char[] ch = current.toCharArray();
          Arrays.sort(ch);
          String sortedword = new String(ch);
          if(hm.containsKey(sortedword))
          {
             hm.get(sortedword).add(current);
          }
          else
          {
             List<String> list = new ArrayList<>();
             list.add(current);
             hm.put(sortedword,list);
          }
       }
       System.out.println(hm.values());
   }
}