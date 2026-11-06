class Subset
{
   static Boolean[][] dp;
   public static boolean partition(int[] arr,int target,int i)
   {
       if(target == 0)
       {
          return true;
       }
       if(i>=arr.length || target < 0)
       {
          return false;
       }
       boolean include = partition(arr, target - arr[i], i+1);
       boolean exclude = partition(arr, target, i+1);
       dp[i][target] = include || exclude;
       return dp[i][target];
   }
   public static void main(String[] args)
   {
      int[] arr = {1,5,11,5};
      int totalsum = 0;
      for(int i=0;i<arr.length;i++)
      {
          totalsum = totalsum + arr[i];
      }
      if(totalsum %2 != 0)
      {
         System.out.println(false);
         return;
      }
      int target = totalsum/2;
      dp = new Boolean[arr.length][target+1];
      System.out.println(partition(arr, target, 0));
   }
}