import java.util.HashMap;

class Subsum
{
   public static void main(String[] args)
   {
       int[] arr = {1,1,1};
       HashMap<Integer,Integer> hm = new HashMap<>();
       hm.put(0,1);
       int sum=0;
       int counts=0;
       int k=3;
       for(int i=0;i<arr.length;i++)
       {
           int current = arr[i];
           sum = sum+current;
           if(hm.containsKey(sum-k))
           {
              counts = counts + (hm.get(sum-k));
           }
           if(hm.containsKey(sum))
           {
              int count = hm.get(sum);
              hm.put(sum,count+1);
           }
           else
           {
              hm.put(sum,1);
           }   
       }
       System.out.println(counts);
   }
}