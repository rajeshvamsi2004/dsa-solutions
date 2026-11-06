import java.util.*;
class Node
{
   int data;
   Node left;
   Node right;
   Node(int data)
   {
      this.data = data;
      this.left = null;
      this.right = null;
   }
}
public class CompleteBinaryTree
{
    public static boolean isComplete(Node node)
    {
       Queue<Node> queue = new LinkedList<>();
       queue.add(node);
       boolean isnull = false;
       while(!queue.isEmpty())
       {
          Node current = queue.poll();
          if(current == null)
          {
              isnull = true;
          }
          else
          {
              if(isnull)
              {
                 return false;
              }
              queue.add(current.left);
              queue.add(current.right);
          }
       }
       return true;
    }
    public static void main(String[] args)
    {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println(isComplete(root));
    }
}