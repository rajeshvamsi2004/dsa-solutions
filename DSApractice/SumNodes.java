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
public class SumNodes
{
   public static int allSum(Node node)
   {
       if(node == null)
       {
         return 0;
       }
       int left =  allSum(node.left);
       int right = allSum(node.right);
       return node.data+left+right;
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
       System.out.println(allSum(root));
   }
}