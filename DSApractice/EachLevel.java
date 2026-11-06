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
public class EachLevel
{
   public static void eachlevel(Node node)
   {
      Queue<Node> queue = new LinkedList<>();
      queue.add(node);
      while(!queue.isEmpty())
      {
         if(node == null)
         {
            return;
         }
         int size = queue.size();
         for(int i=0;i<size;i++)
         {
            Node current = queue.poll();
            System.out.print(current.data +" ");
            if(current.left != null)
            {
                queue.add(current.left);
            }
            if(current.right != null)
            {
                queue.add(current.right);
            }
         } 
         System.out.println();  
      }
   }
   public static void main(String[] args)
   {
       Node root = new Node(1);
       root.left = new Node(2);
       root.left.left = new Node(4);
       root.left.left.left = new Node(8);
       root.left.right = new Node(5);
       root.right = new Node(3);
       root.right.left = new Node(6);
       root.right.right = new Node(7);
       eachlevel(root);
   }
}