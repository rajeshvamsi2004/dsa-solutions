import java.util.*;
class Threesum
{
   public static void main(String[] args)
   {
      int[] arr = {-1,0,1,2,-1,-4};
      Arrays.sort(arr);
      int target = 0;
      int sum = 0;
      for(int i=0;i<arr.length;i++)
      {
         int current = arr[i];
         int left = i+1;
         int right = arr.length-1;
         while(left < right)
         {
            sum = current+arr[left]+arr[right];
            if(sum == target)
            {
                System.out.println(+current + "," + arr[left] + "," +arr[right]);
                left++;
                right--;
            }
            else if(sum < target)
            {
                left++;
            }
            else
            {
                right--;
            }
         }
      }
   }
}