class Peak
{
   public static void main(String[] args)
   {
       int[] arr = {1,2,3,1};;
       int low = 0;
       int high = arr.length-1;
       int mid = 0;
       while(low < high)
       {
          mid = (low+high)/2;
          if(arr[mid] < arr[mid+1])
          {
             low = mid+1;
          }
          else
          {
             high = mid;
          }
       }
       System.out.println("The Peak Element is : " + arr[low]);
   }
}