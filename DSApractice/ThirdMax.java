class ThirdMax
{
   public static void main(String[] args)
   {
      int[] arr = {2,4,1,3,5};
      int firstmax = arr[0];
      int secondmax = arr[1];
      if(arr[0] > arr[1])
      {
         firstmax = arr[0];
         secondmax = arr[1];
      }
      else
      {
         firstmax = arr[1];
         secondmax = arr[0];
      }
      int thirdmax = arr[2];
      if(thirdmax < firstmax && thirdmax < secondmax)
      {
          thirdmax = arr[2];
      }
      else if(thirdmax > firstmax)
      {
          thirdmax = secondmax;
          secondmax = firstmax;
          firstmax = arr[2];
      }
      else if(thirdmax > secondmax)
      {
          thirdmax = secondmax;
          secondmax = arr[2];
      }
      for(int i=3;i<arr.length;i++)
      {
          if(arr[i] > firstmax)
          {
             thirdmax = secondmax;
             secondmax = firstmax;
             firstmax = arr[i];
          }
          else if(arr[i] != firstmax && arr[i] > secondmax)
          {
             thirdmax = secondmax;
             secondmax = arr[i];
          }         
          else if(arr[i] > thirdmax && arr[i] != firstmax && arr[i] != secondmax)   
          {
             thirdmax = arr[i];
          }         
      }
      System.out.println(thirdmax);
   }
}