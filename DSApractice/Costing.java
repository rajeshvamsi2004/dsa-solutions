class Costing
{
   public static int cost(char[] sarray,int coins,int swapcost,int flipcost)
   {
       int value=0;
       for(int i=0;i<sarray.length;i++)
       {
          value = value * 2 + (sarray[i] - '0');
       }
       if(coins <=0)
       {
          return value;
       }
       int min=value;
       for(int i=0;i<sarray.length;i++)
       {
          char[] fliparray = sarray.clone();
          if(coins >= flipcost)
          {
             if(fliparray[i] == '0')
             {
                fliparray[i] = '1';
             }
             else
             {
               fliparray[i] = '0';
             }
             int flip = cost(fliparray,coins-flipcost,swapcost,flipcost);
             min = Math.min(min,flip);
          }
          for(int j=i+1;j<sarray.length;j++)
          {
             if(sarray[i] != sarray[j] && coins>=swapcost)
             {
                char[] swaparray = sarray.clone();
                char temp = swaparray[i];
                swaparray[i] = swaparray[j];
                swaparray[j] = temp;
                int swap = cost(swaparray,coins-swapcost,swapcost,flipcost);
                min = Math.min(min,swap); 
             }
          }
       }
       return min;
   }
   public static void main(String[] args)
   {
      String s="111011";
      char[] sarray = s.toCharArray();
      int coins=7;
      int swapcost=3;
      int flipcost=2;
      System.out.println(cost(sarray,coins,swapcost,flipcost));
   }
}