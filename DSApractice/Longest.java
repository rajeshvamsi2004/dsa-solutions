import java.util.*;
class Longest
{
    public static void main(String[] args)
    {
        int[] arr = {100,4,200,1,3,2};
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        int maxcount = 0;
        for(int i=0;i<arr.length;i++)
        {
           int current = arr[i];
           if(!hs.contains(current-1))
           {
               int start = current;
               int count=1;
               while(hs.contains(start+1))
               {
                  start++;
                  count++; 
               }
               maxcount = Math.max(maxcount,count);
           }
        }
        System.out.println(maxcount);
    }
}