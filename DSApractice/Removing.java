import java.util.Stack;

class Removing
{
   public static void main(String[] args)
   {
       String s = "Leet**cod*e";
       Stack<Character> stack = new Stack<>();
       for(int i=0;i<s.length();i++)
       {
          char current = s.charAt(i);
          if(current == '*')
          {
              stack.pop();
          }
          else
          {
             stack.push(current);
          }
       }
       for(char c:stack)
       {
          System.out.print(c);
       }
   }
}