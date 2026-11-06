class Prefix
{
   public static void main(String[] args)
   {
      String[] arr = {"interview","internet","internal"};
      String s = arr[0];
      for(int i=1;i<arr.length;i++)
      {
          String current = arr[i];
          int k=0;
          while(k<current.length() && k<s.length() &&  current.charAt(k) == s.charAt(k))
          {
              k++;
          }
          String sub = current.substring(0,k);
          s = sub;
      }
      System.out.println(s);
   }
}