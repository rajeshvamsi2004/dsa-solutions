import java.util.*;
class Threesums
{
   public static void main(String[] args)
   {
       int[] arr = {1,2,4,8,16};
       int target = 15;
       int finalsum = 0;
       int mindis = Integer.MAX_VALUE;
       Arrays.sort(arr);
       for(int i=0;i<arr.length;i++)
       {
           int current = arr[i];
           int left = i+1;
           int right = arr.length-1;
           int sum = 0;
           while(left < right)
           {
               sum = current+arr[left]+arr[right];
               int val = Math.abs(target-sum);
               if(val < mindis)
               {
                   mindis = val;
                   finalsum = sum;
               }
               if(sum < target)
               {
                  left++;
               }
               else
               {
                  right--;
               }
           }
       }
       System.out.println(finalsum);
   }
}