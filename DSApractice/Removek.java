import java.util.*;
class Removek
{
    public static void main(String[] args)
    {
        String s = "1432219";
        char[] numarray = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<numarray.length;i++)
        {
            int current = numarray[i] - '0';
            if(stack.isEmpty())
            {
                stack.push(current);
            }
            else if(!stack.isEmpty() && current > stack.peek())
            {
               stack.push(current);
            }
            else if(!stack.isEmpty() && current <= stack.peek())
            {
                stack.pop();
            }

        }
    }
}