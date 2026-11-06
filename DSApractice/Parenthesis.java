import java.util.*;
class Parenthesis
{
   public static void main(String[] args)
   {
      String s="(){}[]";
      Stack<Character> stack = new Stack<>();
      for(int i=0;i<s.length();i++)
      {
          char current = s.charAt(i);
          if(current == '(' || current == '[' || current == '{')
          {
             stack.push(current);
          }
          else if(!stack.isEmpty())
          {
              if(current == ')' && stack.peek() == '(' || current == ']' && stack.peek() == '[' || current == '}' && stack.peek() == '{')
              {
                  stack.pop();
              }
          }
      }
      if(stack.isEmpty())
      {
         System.out.println("The give string is valid");
      }
      else
      {
         System.out.println("The given string is invalid");
      }
   }
}