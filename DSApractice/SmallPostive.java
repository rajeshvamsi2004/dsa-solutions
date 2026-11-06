class SmallPostive
{
   public static void main(String[] args)
   {
      int[] arr = {3,4,-1,1};
      for(int i=0;i<arr.length;i++)
      {
         while(arr[i] >=1 && arr[i] <= arr.length && arr[i] != arr[arr[i]-1])
         {
            int temp = arr[i];
            arr[i] = arr[temp-1];
            arr[temp-1] = temp;
         }
      }
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i] != i+1)
          {
              System.out.println(i+1);
              return;
          }
      }
      System.out.println(arr.length+1);
   }
}