class Countingall
{
   public static void main(String[] args)
   {
      int[] arr = {1, 0, 1, 1, 0, 0, 1, 0, 1};
      int maxlong = 0;
      int zerocount=0;
      int onecount=0;
      for(int i=0;i<arr.length;i++)
      {
          if(arr[i] == 0)
          {
              zerocount++;
          }
          else
          {
              onecount++;
          }
          if(zerocount == onecount)
          {
              maxlong = Math.max(maxlong,i+1);
          }
      }
      System.out.println(maxlong);
   }
}