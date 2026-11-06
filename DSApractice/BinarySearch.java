class BinarySearch
{
   public static void main(String[] args)
   {
      int[] arr = {1,3,5,7,9,11,13};
      int low = 0;
      int high = arr.length-1;
      int mid = 0;
      int target = 9;
      while(low <= high)
      {
         mid = (low+high)/2;
         if(target == arr[mid])
         {
            System.out.println(mid);
            break;
         }
         else if(target < arr[mid])
         {
            high = mid-1;
         }
         else
         {
            low = mid+1;
         }
      }
   }
}