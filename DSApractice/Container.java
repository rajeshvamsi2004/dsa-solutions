class Container
{
   public static void main(String[] args)
   {
      int[] arr = {1,8,6,2,5,4,8,3,7};
      int i=0;
      int j=arr.length-1;
      int width = 0;
      int height = 0;
      int maxwater = 0;
      int water = 0;
      while(i < j)
      {
         width = j-i;
         height = Math.min(arr[i],arr[j]);
         maxwater = Math.max(maxwater,width*height);
         if(arr[j] > arr[i])
         {
           i++;
         }
         else
         {
            j--;
         }
      }
      System.out.println(maxwater);
   }
}