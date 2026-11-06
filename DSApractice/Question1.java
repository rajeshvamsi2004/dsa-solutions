class Question1
{
   public static void main(String[] args)
   {
       int n = 1234;
       int total = 0;
       while(n%10 != 0)
       {
          int digit = n%10;
          total = total + digit;
          n = n/10;
       }
       System.out.println(total);
   }
}