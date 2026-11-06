class Ascending
{
   public static void main(String[] args)
   {
      int[] arr = {5,10,9,15,20};
      boolean isnotsorted = false;
      for(int i=1;i<arr.length;i++)
      {
         if(arr[i] < arr[i-1])
          {
              isnotsorted = true;
          }   
      }
      if(isnotsorted)
      {
         System.out.println("It is not sorted");
      }
      else
      {
         System.out.println("It is sorted");
      }
   }
}