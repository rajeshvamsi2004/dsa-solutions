public class Coinchange {
   public static int targeting(int[] arr,int i,int amount)
   {
      if(amount == 0)
      {
         return 0;
      }
      if(i==arr.length)
      {
        return Integer.MAX_VALUE;
      }
      int take = Integer.MAX_VALUE;
      if(amount >= arr[i])
      {
         int sub = targeting(arr, i, amount-arr[i]);
         if(sub != Integer.MAX_VALUE)
         {
            take = 1 + sub;
         }
      }
      int skip = targeting(arr, i+1, amount);
      return Math.min(take,skip);
   }
   public static void main(String[] args) {
       int[] arr = {1,5,6,9};
       int amount = 11;
       System.out.println(targeting(arr, 0, amount));
   }
}
