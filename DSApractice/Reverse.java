class Reverse
{
   public static void main(String[] args)
   {
      int n=523;
      int rev=0;
      int rem=0;
      while(n%10 != 0)
      {
          rem = n%10;
          rev = rev*10+rem;
          n = n/10;
      }
      System.out.println(rev);
   }
}