class Palindromecheck
{
   public static void main(String[] args)
   {
      
      String s = "madam";
      int i=0;
      int j=s.length()-1;
      boolean ispalindrome = false;
      while(i < j)
      {
         if(s.charAt(i) != s.charAt(j))
         {
            ispalindrome = true;
            break;
         }
         i++;
         j--;
      }
      if(ispalindrome)
      {
          System.out.println("The Given String is a Not Palindrome");
      }
      else
      {
         System.out.println("The Given String is a Palindrome");
      }
   }
}