class Water
{
   public static void main(String[] args)
   {
      int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
      int water = 0;
      for(int i=0;i<arr.length;i++)
      {
         int current = arr[i];
         int leftmax = 0;
         int left=i-1;
         while(left >= 0)
         {
            if(arr[left] > leftmax)
            {
                leftmax = arr[left];
            }
            left--;
         }
         int right = i+1;
         int rightmax = 0;
         while(right < arr.length)
         {
            if(arr[right] > rightmax)
            {
               rightmax = arr[right];
            }
            right++;
         }
         int currentwater = Math.min(leftmax,rightmax) - current;
         if(currentwater > 0)
         {
            water = water+currentwater;
         }
      }
      System.out.println(water);
   }
}