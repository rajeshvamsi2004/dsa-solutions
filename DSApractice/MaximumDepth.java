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
class MaximumDepth
{
   public static int depth(Node node)
   {
      if(node == null)
      {
         return 0;
      }
      int leftheight = depth(node.left);
      int rightheight = depth(node.right);
      return 1+Math.max(leftheight,rightheight);
   }
   public static void main(String[] args)
   {
      Node root = new Node(1);
      root.left = new Node(9);
      root.right = new Node(20);
      root.right.left = new Node(15);
      root.right.right = new Node(7);
      System.out.println(depth(root));
   }
}