class StringReversing
{
   public static void main(String[] args)
   {
      String s = "hello";
      char[] ch = s.toCharArray();
      int i=0;
      int j=ch.length-1;
      while(i<j)
      {
         char temp = ch[i];
         ch[i] = ch[j];
         ch[j] = temp;
         i++;
         j--;
      }
      StringBuilder sb = new StringBuilder("");
      for(int k=0;k<ch.length;k++)
      {
         sb.append(ch[k]);
      }
      System.out.println(sb.toString());
   }
}