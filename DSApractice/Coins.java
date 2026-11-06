class Coins
{
    public static int minCoins(int[] coins,int amount,int i)
    {
        if(amount == 0)
        {
           return 0;
        }
        if(i>=coins.length)
        {
             return Integer.MAX_VALUE;
        }
        if(amount < 0)
        {
           return Integer.MAX_VALUE;
        }
        int take=minCoins(coins, amount-coins[i], i);
        if(take != Integer.MAX_VALUE)
        {
            take = take+1;
        }
        int skip = minCoins(coins, amount,i+1);
        return Math.min(take,skip);
    }
    public static void main(String[] args)
    {
        int[] coins = {1,2,5};
        int amount = 11;
        System.out.println(minCoins(coins,amount,0));
    }
}