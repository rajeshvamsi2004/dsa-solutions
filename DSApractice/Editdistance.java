class Editdistance
{
    static int[][] dp;
    public static int operations(String s1,String s2,int i,int j)
    {
        if(i==s1.length())
        {
           return s2.length()-j;
        }
        if(j==s2.length())
        {
           return s1.length()-i;
        }
        if(dp[i][j] != -1)
        {
            return dp[i][j];
        }
        if(s1.charAt(i) == s2.charAt(j))
        {
           return operations(s1, s2, i+1, j+1);
        }
        else
        {
            int replace = 1+operations(s1,s2,i+1,j+1);
            int delete = 1+operations(s1,s2,i+1,j);
            int insert = 1+operations(s1,s2,i,j+1);
            dp[i][j] = Math.min(replace,Math.min(delete,insert));
        }
        return dp[i][j];
    }
    public static void main(String[] args)
    {
        String s1 = "horse";
        String s2 = "ros";
        dp = new int[s1.length()][s2.length()];
        for(int x=0;x<s1.length();x++)
        {
           for(int y=0;y<s2.length();y++)
           {
              dp[x][y] = -1;
           }
        }
        System.out.println(operations(s1, s2, 0, 0));
    }
}