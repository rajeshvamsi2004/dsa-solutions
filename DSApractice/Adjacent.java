import java.util.*;
class Adjacent
{
   public static void main(String[] args)
   {
      String s = "abbaca";
      Stack<Character> stack = new Stack<>();
      for(int i=0;i<s.length();i++)
      {
          char current = s.charAt(i);
          if(!stack.isEmpty() && current == stack.peek())
          {
             stack.pop();
          }
          else
          {
            stack.push(current);
          }
      }
      StringBuilder sb = new StringBuilder();
      for(char c:stack)
      {
         sb.append(c);
      }
      System.out.println(sb);
   }
}