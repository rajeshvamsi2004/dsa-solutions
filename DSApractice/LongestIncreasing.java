import java.util.*;
class LongestIncreasing
{
   public static int sequence(int[] arr)
   {
      Stack<Integer> stack = new Stack<>();
      for(int i=0;i<arr.length;i++)
      {
         int current = arr[i];
         if(stack.isEmpty() || current > stack.peek())
         {
            stack.push(current);
         }
         else 
         {
            while(!stack.isEmpty() && current < stack.peek())
            {
               stack.pop();
            }
            stack.push(current);
         }
      }
      return stack.size();
   }
   public static void main(String[] args)
   {
      int[] arr = {10,9,2,5,3,7,101,18};
      System.out.println(sequence(arr));
   }
}