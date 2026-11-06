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
class Lca
{
   public static Node ancestor(int p,int q,Node node)
   {
      if(node == null || node.data == p || node.data == q)
      {
         return node;
      }
      Node left = ancestor(p,q,node.left);
      Node right = ancestor(p, q, node.right);
      if(left != null && right != null)
      {
         return node;
      }
      return (left != null) ? left : right;
   }
   public static int countNodes(Node node)
   {
      if(node == null)
      {
         return 0;
      }
      int left = countNodes(node.left);
      int right = countNodes(node.right);
      return 1+left+right;
   }
   public static void main(String[] args)
   {
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        Node val = ancestor(7,4,root);
        int res = countNodes(val);
        System.out.println(res);
   }
}