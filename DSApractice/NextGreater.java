import java.util.*;
class NextGreater
{
   public static void main(String[] args)
   {
      int[] arr = {1,2,1};
      int[] result = new int[arr.length];
      Arrays.fill(result,-1);
      Stack<Integer> stack = new Stack<>();
      for(int i=0;i<2*arr.length;i++)
      {
          int index = i%arr.length;
          int current = arr[index];
          while(!stack.isEmpty() && current > arr[stack.peek()])
          {
              int indexnum = stack.pop();
              result[indexnum] = current;
          }
          if(i < arr.length)
          {
             stack.push(index);
          }
      }
      for(int i=0;i<result.length;i++)
      {
          System.out.print(result[i] + " ");
      }
   }
}