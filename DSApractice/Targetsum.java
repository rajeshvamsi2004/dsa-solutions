import java.util.*;
public class Targetsum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
           int target = 9;
           int current = arr[i];
           int complement = target - current;
           if(hm.containsKey(complement))
           {
              System.out.println(hm.get(complement) + "," +i);
              break;
           }
           else
           {
              hm.put(current,i);
           }
        }
    }
}
