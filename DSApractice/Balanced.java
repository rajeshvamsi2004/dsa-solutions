import java.util.Stack;

class Balanced
{
   public static int checkBalanced(String s)
   {
       Stack<Character> stack = new Stack<>();
       int count=0;
       for(int i=0;i<s.length();i++)
       {
          char current = s.charAt(i);
          if(current == '(' || current == '{' || current == '[')
          {
             stack.push(current);
          }
          else 
          {
              if(stack.isEmpty())
              {
                 return - 1;
              }
              if(current == ')' && stack.peek() == '(' || current ==']' && stack.peek() == '[' || current == '}' && stack.peek() == '{')
              {
                  stack.pop();
                  count++;
              }
              else
              {
                 return -1;
              }
          }
       }
       return stack.isEmpty() ? count : -1;
   }
   public static void main(String[] args)
   {
      String s = "[{}]";
      int result = checkBalanced(s);
      if(result != -1)
      {
         System.out.println("Balanced pairs are : " + result);
      }
      else
      {
         System.out.println("Not Balanced");
      }
   }
}