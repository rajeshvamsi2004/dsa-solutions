class Maximum
{
   public static void main(String[] args)
   {
      int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
      int sum = 0;
      int maxsum = Integer.MIN_VALUE;
      int start = 0;
      int tempstart = 0;
      int end = 0;
      for(int i=0;i<arr.length;i++)
      {
           sum = sum + arr[i];
           if(sum > maxsum)
           {
              maxsum = sum;
              start = tempstart;
              end = i;
           }
           if(sum < 0)
           {
              sum = 0;
              tempstart = i+1;
           }
      }
      System.out.println(maxsum);
      for(int i=start;i<=end;i++)
      {
         System.out.print(arr[i] + " ");
      }
   }
}