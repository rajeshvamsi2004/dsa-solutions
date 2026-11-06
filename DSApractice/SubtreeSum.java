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
public class SubtreeSum
{
    static int mindiff = Integer.MAX_VALUE;
    static Node val;
    public static int subtreesum(int k,Node node)
    {
       if(node == null)
       {
         return 0;
       }
       int left = subtreesum(k,node.left);
       int right = subtreesum(k,node.right);
       int currentsum = node.data+left+right;
       int diff = Math.abs(currentsum - k);
       if(diff < mindiff)
       {
          mindiff = diff;
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
       subtreesum(15,root);
       System.out.println(val.data);
    }
}