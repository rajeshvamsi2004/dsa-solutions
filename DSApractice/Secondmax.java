class Secondmax
{
   public static void main(String[] args)
   {
      int[] arr = {10,5,20,8,15};
      int firstmax = arr[0];
      int secondmax = arr[1];
      for(int i=2;i<arr.length;i++)
      {
         if(arr[i] > firstmax)
         {
            secondmax = firstmax;
            firstmax = arr[i];
         }
         else if(arr[i] > secondmax && arr[i] != firstmax)
         {
             secondmax = arr[i];
         }
      }
      System.out.println(secondmax);
   }
}