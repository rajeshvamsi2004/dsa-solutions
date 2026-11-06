class ContiguousSubarray
{
   public static void main(String[] args)
   {
      int[] arr = {1,3,2,3,3};
      int maxele = Integer.MIN_VALUE;
      for(int i=0;i<arr.length;i++)
      {
         int current = arr[i];
         if(current > maxele)
         {
            maxele = current;
         }
      }
      int unicount=0;
      int k=2;
      int left=0;
      int subcount = 0;
      for(int right=0;right<arr.length;right++)
      {
         int current = arr[right];
         if(current == maxele)
         {
            unicount++;
         }
         while(unicount >= k)
         {
            subcount=subcount+(arr.length-right);
            if(arr[left] == maxele)
            {
               unicount--;
            }
            left++;
         }
      }
      System.out.println(subcount);
   }
}