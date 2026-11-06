import java.util.*;
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
public class Zigzag
{
    public static List<List<Integer>> traversal(Node node)
    {
       int count=0;
       List<List<Integer>> result  = new ArrayList<>();
       Queue<Node> queue = new LinkedList<>();
       queue.add(node);
       while(!queue.isEmpty())
       {
          List<Integer> list = new ArrayList<>();
          int size = queue.size();
          for(int i=0;i<size;i++)
          {
              Node current = queue.poll();
              list.add(current.data);
              if(current.left != null)
              {
                 queue.add(current.left);
              }
              if(current.right != null)
              {
                 queue.add(current.right);
              }
          }
          count++;
          if(count %2 == 0)
          {
              Collections.reverse(list);
              result.add(list);
          }
          else
          {
            result.add(list);
          }
       }
       return result;
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
       System.out.println(traversal(root));
    }
}