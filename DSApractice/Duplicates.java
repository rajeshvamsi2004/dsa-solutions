import java.util.*;
class Duplicates
{
   public static void main(String[] args)
   {
       int[] arr = {10,20,10,30,20,40};
       List<Integer> list = new ArrayList<>();
       for(int i=0;i<arr.length;i++)
       {
          int current = arr[i];
          int j=0;
          boolean isduplicate = false;
          int count=0;
          while(j < arr.length)
          {
             if(current == arr[j])
             {
                count++;
                isduplicate = true;
             }
             j++;
          }
          if(isduplicate && count>=2 && !list.contains(current))
          {
             list.add(current);
          }
       }
       System.out.println(list);
   }
}