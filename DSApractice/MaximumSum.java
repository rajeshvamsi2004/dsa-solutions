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
public class MaximumSum
{
    public static int maximum(Node node)
    {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        int maxsum = 0;
        while(!queue.isEmpty())
        {
            int size = queue.size();
            int sum = 0;
            for(int i=0;i<size;i++)
            {
               Node current = queue.poll();
               sum = sum+current.data;
               if(current.left != null)
               {
                  queue.add(current.left);
               }
               if(current.right != null)
               {
                  queue.add(current.right);
               }
            }
            maxsum = Math.max(maxsum,sum);
        }
        return maxsum;
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
       System.out.println(maximum(root));
    }
}