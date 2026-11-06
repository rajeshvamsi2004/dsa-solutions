import java.util.*;
class Partitioning
{
   static List<List<String>> result = new ArrayList<>();
   public static boolean ispalindrome(String s)
   {
      int i=0;
      int j=s.length()-1;
      while(i < j)
      {
         if(s.charAt(i) != s.charAt(j))
         {
            return false;
         }
         i++;
         j--;
      }
      return true;
   }
   public static List<List<String>> parts(String s,int i,List<String> list,List<List<String>> result)
   {
      if(i==s.length())
      {
         result.add(new ArrayList<>(list));
         return result;
      }
      for(int j=i;j<s.length();j++)
      {
         String sub = s.substring(i, j+1);
         if(ispalindrome(sub))
         {
            list.add(sub);
            parts(s,j+1,list,result);
            list.remove(list.size()-1);
         }
      }
      return result;
   }
   public static void main(String[] args)
   {
       String s = "aab";
       List<String> list = new ArrayList<>();
       System.out.println(parts(s,0,list,result));
   }
}