class Founding
{
   public static void main(String[] args)
   {
      int[] arr = {4,5,6,7,0,1,2};
      int low = 0;
      int high = arr.length-1;
      int target=0;
      while(low <= high)
      {
          int mid = (low+high)/2;
          if(arr[mid] == target)
          {
             System.out.println(mid);
             break;
          }
          if(arr[low] <= arr[mid])
          {
             if(arr[low] <= target && target <= arr[mid])
             {
                high = mid-1;
             }
             else
             {
                low = mid+1;
             }
          }
          else
          {
             if(arr[mid] <= target && target <= arr[high])
             {
                 low = mid+1;
             }
             else
             {
                high = mid-1;
             }
          }  
      }
   }
}