class SwapsOnes
{
   public static int swaps(int[] arr)
   {
      int onesc = 0;
      for(int i=0;i<arr.length;i++)
      {
         int current = arr[i];
         if(current == 1)
         {
            onesc++;
         }
      }
      int left=0;
      int count=0;
      int minoperations = Integer.MAX_VALUE;
      int zeroc=0;
      for(int right=0;right<arr.length;right++)
      {
          if(arr[right] == 0)
          {
             zeroc++;
          }
          count++;
          if(count >= onesc)
          {
             minoperations = Math.min(minoperations,zeroc);
             if(arr[left] == 0)
             {
                zeroc--;
             }
             left++;
             count--;
          }
      }
      return minoperations;
   }
   public static void main(String[] args)
   {
      int[] arr = {1,0,1,0,1};
      System.out.println(swaps(arr));
   }
}