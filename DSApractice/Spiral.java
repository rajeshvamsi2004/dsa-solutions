class Spiral
{
   public static void main(String[] args)
   {
      int[][] arr = {
         {1,2,3},
         {4,5,6},
         {7,8,9}
      };
      int left = 0;
      int right = arr.length-1;
      int top = 0;
      int bottom = arr[0].length-1;
      int sum=0;
      int oddcount = 0;
      while(left <= right && top <= bottom)
      {
         for(int i=left;i<=right;i++)
         {
            if(arr[top][i] %2 == 0)
            {
               sum = sum + arr[top][i];
            }
            else
            {
               oddcount++;
            }
         }
         top++;
         for(int i=top;i<=bottom;i++)
         {
            if(arr[i][right] %2 == 0)
            {
               sum = sum + arr[i][right];
            }
            else
            {
               oddcount++;
            }
         }
         right--;
         for(int i=right;i>=left;i--)
         {
            if(arr[bottom][i] %2 == 0)
            {
               sum = sum+arr[bottom][i];
            }
            else
            {
               oddcount++;
            }
         }
         bottom--;
         for(int i=bottom;i>=top;i--)
         {
            if(arr[i][left] %2 == 0)
            {
               sum = sum + arr[i][left];
            }
            else
            {
               oddcount++;
            }
         }
         left++;
      }
      System.out.println(sum);
      System.out.println(oddcount);
   }
}