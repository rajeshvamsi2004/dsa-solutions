class Maximumsub
{
   public static void main(String[] args)
   {
      int[] arr = {2,3,4,1,5};
      int k=2;
      int sum=0;
      int left=0;
      int count = 0;
      int maxsum = 0;
      for(int right=0;right<arr.length;right++)
      {
          sum = sum + arr[right];
          count++;
          if(count > k)
          {
              sum = sum - arr[left];
              left++;
              count--;
          }
          if(count == k)
          {
             maxsum = Math.max(sum,maxsum);
          }
      }
      System.out.println(maxsum);
   }
}