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
public class Diameter
{
   static int maxi = 0;
   public static int diameter(Node node)
   {
       if(node == null)
       {
          return -1;
       }
       int left = diameter(node.left);
       int right = diameter(node.right);
       int dtn = left+right+2;
       if(dtn > maxi)
       {
          maxi = dtn;
       }
       return 1+Math.max(left,right);
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
       diameter(root);
       System.out.println(maxi);
   }
}