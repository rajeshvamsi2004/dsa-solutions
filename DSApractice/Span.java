import java.util.*;
class Span
{
    public static void main(String[] args)
    {
        int[] arr = {100,80,60,70,60,75,85};
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int current = arr[i];
            while(!stack.isEmpty() && current > arr[stack.peek()])
            {
               stack.pop();
            }
            if(stack.isEmpty())
            {
               result[i] = i+1;
            }
            else
            {
               result[i] = i - stack.peek();
            }
            stack.push(i);
        }
        for(int i=0;i<result.length;i++)
        {
           System.out.print(result[i] + " ");
        }
    }
}