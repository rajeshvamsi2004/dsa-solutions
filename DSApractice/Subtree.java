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
public class Subtree
{
   static int maxsum = 0;
   static Node val=null;
   public static int subtree(Node node)
   {
      if(node == null)
      {
         return 0;
      }
      int left = subtree(node.left);
      int right = subtree(node.right);
      int currentsum = node.data + left + right;
      if(currentsum > maxsum)
      {
         maxsum = currentsum;
         val = node;
      }
      return currentsum;
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
       subtree(root);
       System.out.println(val.data);
   }
}