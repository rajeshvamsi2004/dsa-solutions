import java.util.*;
class Temperatures
{
   public static void main(String[] args)
   {
      int[] arr = {30,40,35,50};
      int[] result = new int[arr.length];
      Stack<Integer> stack = new Stack<>();
      for(int i=0;i<arr.length;i++)
      {
          int current = arr[i];
          while(!stack.isEmpty())
          {
              if(current > arr[stack.peek()])
              {
                 result[stack.peek()] = i-stack.peek();
                 stack.pop();
              }
              else
              {
                  break;
              }
          }
          stack.push(i);
      }
      for(int i=0;i<result.length;i++)
      {
          System.out.print(result[i] + " ");
      }
   }
}