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
class BST
{
   public static boolean isValidBST(Node root)
   {
      return isbst(root, Long.MIN_VALUE, Long.MAX_VALUE);
   }
   public static boolean isbst(Node node,long max,long min)
   {
      if(node == null)
      {
         return true;
      }
      if(node.data <= min && node.data >= max)
      {
         return false;
      }
      boolean left = isbst(node.left,node.data,min);
      boolean right = isbst(node.right,max,node.data);
      return left && right;
   }
   public static void main(String[] args)
   {
      Node root2 = new Node(5);
      root2.left = new Node(1);
      root2.right = new Node(4);
      root2.right.left = new Node(3);
      root2.right.right = new Node(6);
      System.out.println("Tree 2 Valid: " + isValidBST(root2));
   }
}