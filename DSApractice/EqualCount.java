import java.util.HashMap;

class EqualCount
{
   public static void main(String[] args)
   {
      int[] arr = {0,1,0,1,1,1,0};
      int maxlen = 0;
      for(int i=0;i<arr.length;i++)
      {
          int zerocount = 0;
          int onecount = 0;
          for(int j=i;j<arr.length;j++)
          {
              if(arr[j] == 0)
              {
                  zerocount++;
              }
              else
              {
                  onecount++;
              }
              if(zerocount == onecount)
              {
                  maxlen = Math.max(maxlen,j-i+1);
              }
          }
      }
      System.out.println(maxlen);
   }
}