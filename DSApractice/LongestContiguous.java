class LongestContiguous
{
   public static void main(String[] args)
   {
      int[] arr = {1,2,3,4,5};
      int target = 5;
      int sum=0;
      int maxlen=0;
      int left=0;
      for(int right=0;right<arr.length;right++)
      {
         sum = sum+arr[right];
         while(sum>target)
         {
            sum = sum-arr[left];
            left++;
         }
        maxlen = Math.max(maxlen,right-left+1);
      }
      System.out.println(maxlen);
   }
}