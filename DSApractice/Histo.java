import java.util.*;
class Histo
{
   public static void main(String[] args)
   {
      int[] arr = { 2,1,5,6,2,3};
      Stack<Integer> stack = new Stack<>();
      int maxarea=0;
      for(int i=0;i<arr.length;i++)
      {
          int current = arr[i];
          while(!stack.isEmpty() && current < arr[stack.peek()])
          {
             int index = stack.pop();
             int height = arr[index];
             int width;
             if(stack.isEmpty())
             {
                width = i;
             }
             else
             {
                width = i - stack.peek() - 1;
             }
             int area = height * width;
             maxarea = Math.max(maxarea,area);
          }
          stack.push(i);
      }
      System.out.println(maxarea);
   }
}