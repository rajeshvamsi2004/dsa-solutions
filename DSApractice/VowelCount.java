class VowelCount
{
   public static void main(String[] args)
   {
      String s = "hello";
      int count = 0;
      for(int i=0;i<s.length();i++)
      {
         char current = s.charAt(i);
         if(current == 'a' || current == 'e' || current == 'i' || current == 'o' || current == 'u')
         {
            count++;
         }
      }
      System.out.println(count);
   }
}