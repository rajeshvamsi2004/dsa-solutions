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
public class BalancedBinaryTree
{
   static boolean balance = true;
   public static int balance(Node node)
   {
      if(node == null)
      {
         return -1;
      }
      int left = balance(node.left);
      int right = balance(node.right);
      if(Math.abs(left-right) > 1)
      {
         balance = false;
      }
      return 1+Math.max(left,right);
   }
   public static void main(String[] args)
   {
       Node root = new Node(1);
       root.left = new Node(2);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.right = new Node(3);
       root.right.right = new Node(6);
       root.right.right.right = new Node(7);
       balance(root);
       System.out.println(balance);
   }
}