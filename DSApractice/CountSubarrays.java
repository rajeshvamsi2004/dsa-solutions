import java.util.*;
class CountSubarrays
{
    public static void main(String[] args)
    {
        int[] arr = {1, 2, 3, -2, 2};
        int k=3;
        HashMap<Integer,Integer> hm = new HashMap<>();
        hm.put(0,1);
        int sum=0;
        int count = 0;
        for(int i=0;i<arr.length;i++)
        {
            sum = sum + arr[i];
            if(hm.containsKey(sum-k))
            {
                count = count + hm.get(sum-k);
            }
            if(hm.containsKey(sum))
            {
                hm.put(sum,hm.get(sum)+1);
            }
            else
            {
                hm.put(sum,1);
            }
        }
        System.out.println(count);
    }
}