import java.util.*;
public class Nonrepeating {
   public static void main(String[] args) {
       HashMap<Integer,Integer> hm = new HashMap<>();
       int[] arr = {1,2,1,3,2,1};
       for(int i=0;i<arr.length;i++)
       {
          int current = arr[i];
          if(hm.containsKey(current))
          {
             int count = hm.get(current);
             hm.put(current,count+1);
          }
          else
          {
             hm.put(current,1);
          }
       }
       for(int i=0;i<arr.length;i++)
       {
          int current = arr[i];
          if(hm.get(current) == 1)
          {
              System.out.println(current);
          }
       }
   }
}
