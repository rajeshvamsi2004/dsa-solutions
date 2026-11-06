class FirstOccurence
{
   public static void main(String[] args)
   {
      int[] arr = {1,2,2,2,3,4,5};
      int target = 2;
      int low = 0;
      int high = arr.length-1;
      int mid = 0;
      int ans = 0;
      while(low <= high)
      {
         mid = (low+high)/2;
         if(target == arr[mid])
         {
            ans = mid;
            high = mid-1;
         }
         else if(target < arr[mid])
         {
            high = mid - 1;
         }
         else
         {
            low = mid + 1;
         }
      }
      System.out.println(ans);
   }
}