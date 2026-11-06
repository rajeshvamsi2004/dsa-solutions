class NonDecreasing
{
   public static int minoperations(int[] arr)
   {
       int maximum = arr[0];
       int operations = 0;
       for(int i=1;i<arr.length;i++)
       {
          if(arr[i] < maximum)
          {
             operations = operations+Math.abs(arr[i]-maximum);
          }
          else
          {
             maximum = arr[i];
          }
       }
       return operations;
   }
   public static void main(String[] args)
   {
      int[] arr = {3,4,1,2};
      System.out.println(minoperations(arr));
   }
}