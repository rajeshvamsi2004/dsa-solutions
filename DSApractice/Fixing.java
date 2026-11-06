class Fixing
{
   public static void main(String[] args)
   {
      int[] arr = {2, 1, 5, 1, 3, 2};
      int k=3;
      int sum=0;
      int count=0;
      int left=0;
      int maxsum = 0;
      for(int right=0;right<arr.length;right++)
      {
          sum = sum+arr[right];
          count++;
          if(count == k)
          {
              maxsum = Math.max(sum,maxsum);
              sum = sum-arr[left];
              left++;
              count--;
          }
      }
      System.out.println(maxsum);
   }
}