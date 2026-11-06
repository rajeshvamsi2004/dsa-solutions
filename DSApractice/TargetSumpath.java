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
class TargetSumpath
{
   public static boolean targetsum(int target,Node node)
   {
      if(node == null)
      {
         return false;
      }
      if(node.left == null && node.right == null)
      {
         return target == node.data;
      }
      int newTarget = target - node.data;
      boolean left = targetsum(newTarget,node.left);
      boolean right = targetsum(newTarget,node.right);
      return left || right;
   }
   public static void main(String[] args)
   {
        Node root = new Node(5);
        root.left = new Node(4);
        root.right = new Node(8);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);
        System.out.println(targetsum(22,root));
   }
}