import java.util.*;
class Palindromes 
{
   public static boolean isPalindrome(String sub)
   {
      int i=0;
      int j=sub.length()-1;
      while(i < j)
      {
         if(sub.charAt(i) != sub.charAt(j))
         {
            return false;
         }
         else
         {
            i++;
            j--;
         }
      }
      return true;
   }
   public static void main(String[] args)
   {
      String s = "MALAYALAM";
      List<String> list = new ArrayList<>();
      int count=0;
      for(int i=0;i<s.length();i++)
      {
         for(int j=i+1;j<s.length();j++)
         {
            String subword = s.substring(i,j+1);
            if(subword.length() > 1 && isPalindrome(subword))
            {
               list.add(subword);
               count = count+1;
            }
         }
      }
      System.out.println(list);
      System.out.println(count);
   }
}