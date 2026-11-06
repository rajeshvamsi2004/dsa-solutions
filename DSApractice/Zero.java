class Zero
{
   public static void main(String[] args)
   {
      int[] arr = {1,2,0,4,5,0,6,0,7};
      int i=0;
      int j=0;
      while(i<arr.length && j<arr.length)
      {
         if(arr[i]!=0)
         {
            i++;
            j++;
         }
         else if(arr[j] == 0)
         {
            j++;
         }
         else 
         {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j++;
         }
      }
      for(int k=0;k<arr.length;k++)
      {
         System.out.print(arr[k] + " ");
      }
   }
}