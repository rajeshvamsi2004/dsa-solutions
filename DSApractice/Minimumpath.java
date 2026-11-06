class Minimumpath
{
    static int[][] dp;
    public static int allpaths(int[][] arr,int i,int j)
    {
        if(i>=arr.length || j>=arr[0].length)
        {
            return Integer.MAX_VALUE;
        }
        if(i==arr.length-1 && j==arr[0].length-1)
        {
            return arr[i][j];
        }
        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }
        int down=allpaths(arr,i+1,j);
        int right=allpaths(arr,i,j+1);
        int minval = Math.min(down,right);
        dp[i][j] = arr[i][j] + minval;
        return dp[i][j];
    }
    public static void main(String[] args)
    {
        int[][] arr = {
            {1,3,1},
            {1,5,1},
            {4,2,1}
        };
        dp = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                dp[i][j] = -1;
            }
        }
        System.out.println(allpaths(arr, 0, 0));
    }
}