class MissingNumber
{
   public static void main(String[] args)
   {
      int[] arr = {1,2,4,5,6};
      int n=arr.length;
      int total = 0;
      for(int i=0;i<arr.length;i++)
      {
         total = total + arr[i];
      }
      int avg = n*((n+1)/2);
      int Missing = total - avg;
      System.out.println(Missing);
   }
}