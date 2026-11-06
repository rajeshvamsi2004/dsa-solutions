class MinTicket 
{
   public static int mincost(int i,int tokens,int[] days,int[] costs)
   {
       if(i>=days.length)
       {
          return 0;
       }
       int buy1 = costs[0] + mincost(i+1,tokens,days,costs);
       int nextIndex7 = i;
       while(nextIndex7 < days.length && days[nextIndex7] < days[i]+7)
       {
           nextIndex7++;
       }
       int buy7 = costs[1] + mincost(nextIndex7,tokens+1,days,costs);
       int nextIndex15 = i;
       while(nextIndex15 < days.length && days[nextIndex15] < days[i]+30)
       {
          nextIndex15++;
       }
       int buy15 = costs[2] + mincost(nextIndex15,tokens+2,days,costs);
       int useToken = Integer.MAX_VALUE;
       if (tokens > 0) 
       {
          useToken = 0 + mincost(i + 1, tokens - 1, days, costs);
       }
       return Math.min(buy1,Math.min(buy7,Math.min(buy15,useToken)));
   }
   public static void main(String[] args)
   {
      int[] days = {1,4,6,7,8,20};
      int[] costs = {2,7,15};
      System.out.println(mincost(0,0,days,costs));
   }
}