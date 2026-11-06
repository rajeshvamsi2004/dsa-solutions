import java.util.*;
class WarmerTemperature
{
    public static void main(String[] args)
    {
        int[] arr = {73, 74, 75, 71, 69, 72, 76, 73};
        Stack<Integer> stack = new Stack<>();
        int distance = 0;
        int[] result = new int[arr.length];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            int current = arr[i];
            while(!stack.isEmpty() && current > arr[stack.peek()])
            {
               int index = stack.pop();
               result[index] = i-index;
            }
            stack.push(i); 
        }
        for(int i=0;i<result.length;i++)
        {
            System.out.print(result[i] + " ");
        }
    }
}