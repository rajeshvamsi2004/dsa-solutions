class RotatedSortedArray
{
   public static void main(String[] args)
   {
      int[] arr = {4,5,6,7,0,1,2};
      int low = 0;
      int high = arr.length-1;
      int mid = 0;
      int target = 0;
      while(low <= high)
      {
          mid = (low+high)/2;
          if(target == arr[mid])
          {
             System.out.println(mid);
             return;
          }
          if(arr[low] <= arr[mid])
          {
              if(target >= arr[low] && target < arr[mid])
              {
                 high = mid - 1;
              }
              else
              {
                 low = mid + 1;
              }
          }
          else
          {
             if(arr[mid] <= target && target <= arr[mid])
             {
                 low = mid + 1;
             }
             else
             {
                high = mid - 1;
             }
          }
      }
   }
}