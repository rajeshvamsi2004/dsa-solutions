import java.util.*;
class Duplicate 
{
   public static void main(String[] args)
   {
       int[] arr = {1,2,3,1};
       HashSet<Integer> hs = new HashSet<>();

       for(int i=0;i<arr.length;i++)
       {
          int current = arr[i];
          if(hs.contains(current))
          {
              System.out.println("The Duplicate value is : " + current);
          }
          else
          {
             hs.add(current);
          }
       }
   }
}