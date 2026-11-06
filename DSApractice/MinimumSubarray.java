class MinimumSubarray
{
   public static void main(String[] args)
   {
      int[] arr = {2,3,1,2,4,3};
      int target = 7;
      int left=0;
      int sum=0;
      int minlen = Integer.MAX_VALUE;
      for(int right=0;right<arr.length;right++)
      {
          sum = sum + arr[right];
          while(sum >= target)
          {
             minlen = Math.min(minlen,right-left+1);
             sum = sum - arr[left];
             left++;
          }
      }
      System.out.println(minlen);
   }
}