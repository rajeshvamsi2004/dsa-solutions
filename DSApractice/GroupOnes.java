class GroupOnes
{
   public static void main(String[] args)
   {
      int[] arr = {1,0,1,0,1};
      int onescount=0;
      for(int i=0;i<arr.length;i++)
      {
          int current = arr[i];
          if(current == 1)
          {
             onescount++;
          }
      }
      int count=0;
      int zerocount=0;
      int left=0;
      int minops = Integer.MAX_VALUE;
      for(int right=0;right<arr.length;right++)
      {
         int current = arr[right];
         if(current == 0)
         {
            zerocount++;
         }
         count++;
         if(count == onescount)
         {
            minops = Math.min(minops,zerocount);
            if(arr[left] == 0)
            {
               zerocount--;
            }
            left++;
            count--;
         }
      }
      System.out.println(minops);
   }
}