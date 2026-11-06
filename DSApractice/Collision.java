import java.util.*;
class Collision
{
   public static void main(String[] args)
   {
      int[] arr = {8,-8,5,-2,-10,6};
      Stack<Integer> stack = new Stack<>();
      for(int i=0;i<arr.length;i++)
      {
         int current = arr[i];
         boolean alive = true;
         while(!stack.isEmpty() && stack.peek()>0 && current<0)
         {
             if(Math.abs(stack.peek()) < Math.abs(current))
             {
                 stack.pop();
             }
             else if(Math.abs(stack.peek()) == Math.abs(current))
             {
                stack.pop();
                alive = false;
                break;
             }
             else
             {
                alive = false;
                break;
             }
         }
         if(alive)
         {
            stack.push(current);
         }
      }
      for(int num:stack)
      {
          System.out.print(num + " ");
      }
   }
}