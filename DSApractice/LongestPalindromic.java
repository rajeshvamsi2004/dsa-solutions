class LongestPalindromic
{
    static int[][] dp;
    public static int subsequence(String s,int i,int j)
    {
        if(i>j)
        {
            return 0;
        }
        if(i==j)
        {
           return 1;
        }
        if(s.charAt(i) == s.charAt(j))
        {
            dp[i][j] = 2 + subsequence(s,i+1,j-1);
        }
        else
        {
            int left = subsequence(s, i+1, j);
            int right = subsequence(s, i, j-1);
            dp[i][j] = Math.max(left,right);
        }
        return dp[i][j];
    }
    public static void main(String[] args) {
        String s = "bbabcbcab";
        dp = new int[s.length()][s.length()];
        for(int x=0;x<s.length();x++)
        {
           for(int y=0;y<s.length();y++)
           {
              dp[x][y] = -1;
           }
        }
        System.out.println(subsequence(s, 0, s.length()-1));
    }
}