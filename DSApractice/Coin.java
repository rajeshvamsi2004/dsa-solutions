class Coin
{
   static int[][] dp;
   public static int minimum(int[] arr,int i,int amount)
   {
       if(amount == 0)
       {
          return 0;
       }
       if(i>=arr.length || amount < 0)
       {
          return Integer.MAX_VALUE;
       }
       if(dp[i][amount] != -1)
       {
          return dp[i][amount];
       }
       int samecoin = minimum(arr,i,amount-arr[i]);
       if(samecoin != Integer.MAX_VALUE)
       {
          samecoin = samecoin + 1;
       }
       int skip = minimum(arr,i+1,amount);
       dp[i][amount] =  Math.min(samecoin,skip);
       return dp[i][amount];
   }
   public static void main(String[] args)
   {
      int[] arr = {1,2,5};
      int amount = 11;
      dp = new int[arr.length][amount+1];
      for(int x=0;x<arr.length;x++)
      {
         for(int y=0;y<=amount;y++)
         {
            dp[x][y] = -1;
         }
      }
      System.out.println(minimum(arr, 0, amount));
   }
}