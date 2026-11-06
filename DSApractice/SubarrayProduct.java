class SubarrayProduct
{
   public static int counting(int[] arr,int l,int r)
   {
      int leftl = 0;
      int leftr=0;
      int count = 0;
      int productl = 1;
      int productr = 1;
      for(int right=0;right<arr.length;right++)
      {
         productl = productl * arr[right];
         productr = productr * arr[right];
         while(leftl <= right && productl > l)
         {
            productl = productl/arr[leftl];
            leftl++;
         }
         while(leftr <= right && productr >= r)
         {
            productr = productr/arr[leftr];
            leftr++;
         }
         count = count+(leftl - leftr);
      }
      return count;
   }
   public static void main(String[] args)
   {
      int[] arr = {2,3,4,1};
      int l = 5;
      int r = 25;
      System.out.println(counting(arr, l, r));
   }
}