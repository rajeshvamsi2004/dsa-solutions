import java.util.*;
class Two
{
   public static int[] pairwithsum(int[] arr,int target)
   {
      int[] result = new int[2];
      int i=0;
      int j=arr.length-1;
      int sum = 0;
      while(i < j)
      {
         sum = arr[i] + arr[j];
         if(sum == target)
         {
            return new int[]{arr[i],arr[j]};
         }
         else if(sum < target)
         {
            i++;
         }
         else 
         {
            j--;
         }
      }
      return new int[]{-1,-1};
   } 
   public static void main(String[] args)
   {
      int[] arr = {1,2,3,4,6,8,9};
      int target = 10;
      System.out.println(Arrays.toString(pairwithsum(arr, target)));
   }
}