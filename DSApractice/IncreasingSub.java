class IncreasingSub
{
   public static int longest(int[] arr)
   {
      int maxlen = Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++)
      {
         for(int j=0;j<i;j++)
         {
            if(arr[j] < arr[i] && (arr[j] & arr[i]) * 2 < (arr[j] | arr[i]))
            {
                maxlen = Math.max(maxlen,i-j);
            }
         }
      }
      return maxlen;
   }
   public static void main(String[] args)
   {
      int[] arr = {9,17,2,15,5,2};
      System.out.println(longest(arr));
   }
}