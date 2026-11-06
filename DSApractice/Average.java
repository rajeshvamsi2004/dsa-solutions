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
class Average
{
   public static List<Integer> average(Node node)
   {
      List<Integer> result = new ArrayList<>();
      Queue<Node> queue = new LinkedList<>();
      queue.add(node);
      while(!queue.isEmpty())
      {
         int size = queue.size();
         int average = 0;
         int sum = 0;
         for(int i=0;i<size;i++)
         {
            Node current = queue.poll();
            sum = sum + current.data;
            if(current.left != null)
            {
               queue.add(current.left);
            }
            if(current.right != null)
            {
               queue.add(current.right);
            }
         }
         average = sum/size;
         result.add(average);
      }
      return result;
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
       System.out.println(average(root));
   }
}