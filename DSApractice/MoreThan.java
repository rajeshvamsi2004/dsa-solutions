import java.util.HashMap;

class MoreThan
{
   public static void main(String[] args)
   {
      String s = "programming";
      HashMap<Character,Integer> hm = new HashMap<>();
      for(int i=0;i<s.length();i++)
      {
          char current = s.charAt(i);
          if(hm.containsKey(current))
          {
             int count = hm.get(current);
             hm.put(current,count+1);
          }
          else
          {
             hm.put(current,1);
          }
      }
      for(int i=0;i<s.length();i++)
      {
          char current = s.charAt(i);
          if(hm.get(current) == 2)
          {
             System.out.println(current);
             break;
          }
      }
   }
}