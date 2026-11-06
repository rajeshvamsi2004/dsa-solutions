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
public class LeafNodes
{
   public static int countLeafs(Node node)
   {
      if(node == null)
      {
         return 0;
      }
      if(node.left == null && node.right == null)
      {
         return 1;
      }
      int leftleaf =  countLeafs(node.left);
      int rightleaf = countLeafs(node.right);
      return leftleaf + rightleaf;
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
       System.out.println(countLeafs(root));
   }
}