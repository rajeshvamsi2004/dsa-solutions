import java.util.*;
class Firstrepeat
{
   public static void main(String[] args)
   {
      int[] arr = {1,2,3,1,3,2,5};
      int prevcount=0;
      int element = 0;
      for(int i=0;i<arr.length;i++)
      {
         int current = arr[i];
         int j=i+1;
         boolean isdup = false;
         while(j < arr.length)
         {
            if(current == arr[j])
            {
               element = current;
               break;
            }
            j++;
         }  
      }
      System.out.println(element);
   }
}