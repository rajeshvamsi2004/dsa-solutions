import java.util.*;
class Fibonacci
{
   public static void main(String[] args)
   {
      int n=10;
      List<Integer> list = new ArrayList<>();
      list.add(0);
      list.add(1);
      int sum=0;
      for(int i=2;i<n;i++)
      {
         sum = list.get(i-1)+list.get(i-2);
         list.add(sum);
      }
      System.out.println(list);
   }
}