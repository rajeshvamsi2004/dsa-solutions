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
class MaximumDepthSum
{
   public static int sumdepth(Node node)
   {
      if(node == null)
      {
         return 0;
      }
      int left = sumdepth(node.left);
      int right = sumdepth(node.right);
      return 1+Math.max(left,right);
   }
   public static void main(String[] args)
   {
      Node root = new Node(1);
      root.left = new Node(2);
      root.right = new Node(3);
      root.left.left = new Node(4);
      root.left.right = new Node(5);
      root.left.right.left = new Node(7);
      root.right.right = new Node(6);
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);
      int dep = sumdepth(root);
      int count = 0;
      int sum=0;
      while(!queue.isEmpty())
      {
         int size = queue.size();
         count++;
         for(int i=0;i<size;i++)
         {
            Node current = queue.poll();
            if(count == dep)
            {
               sum = sum+current.data;
            }
            if(current.left != null)
            {
               queue.add(current.left);
            }
            if(current.right != null)
            {
               queue.add(current.right);
            }
         }
      }
      System.out.println(sum);
   }
}