import java.util.*;
class ValidParanthesis
{
   public static boolean isvalid(String s)
   {
      Stack<Character> stack = new Stack<>();
      for(int i=0;i<s.length();i++)
       {
          char current = s.charAt(i);
          if(current == '(' || current == '[' || current == '{')
          {
              stack.push(current);
          }
          else if(stack.isEmpty() || current == ')' && stack.peek() != '(' || current == ']' && stack.peek() != '[' || current == '}' && stack.peek() != '{')
          {
              return false;
          }
          else
          {
             stack.pop();
          }
       }
       return stack.isEmpty();
   }
   public static void main(String[] args) {
       String s = "([)]";
       System.out.println(isvalid(s));   
   }
}