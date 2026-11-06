class LongestSubarrayk
{
   public static void main(String[] args)
   {
      int[] arr = {1, 2, 1, 0, 1, 1, 0};
      int k=4;
      int sum=0;
      int maxlen=Integer.MIN_VALUE;
      int left=0;
      for(int right=0;right<arr.length;right++)
      {
         sum = sum + arr[right];
         while(sum > k)
         {
            sum = sum-arr[left];
            left++;
         }
         maxlen = Math.max(maxlen,right-left+1);
      }
      System.out.println(maxlen);
   }
}