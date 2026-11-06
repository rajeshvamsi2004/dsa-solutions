class RainWater
{
   public static void main(String[] args)
   {
      int[] arr = {4,2,0,3,2,5};
      int water = 0;
      for(int i=1;i<arr.length-1;i++)
      {
          int leftmax = 0;
          int rightmax = 0;
          int left = i-1;
          while(left >= 0)
          {
              leftmax = Math.max(leftmax,arr[left]);
              left--;
          }
          int right = i+1;
          while(right < arr.length)
          {
              rightmax = Math.max(rightmax,arr[right]);
              right++;
          }
          water = water + Math.min(leftmax,rightmax) - arr[i];
      }
      System.out.println(water);
   }
}