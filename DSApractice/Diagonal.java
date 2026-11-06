class Diagonal
{
   public static void main(String[] args)
   {  
      int[][] arr = {
         {1,2,3},
         {4,5,6},
         {7,8,9}
      };
      int leftsum = 0;
      for(int i=0;i<arr.length;i++)
      {
         for(int j=0;j<arr[0].length;j++)
         {
            if(i==j)
            {
               leftsum = leftsum + arr[i][j];
            }
         }
      }
      int k = arr.length-1;
      int rightsum = 0;
      int centered=0;
      for(int i=0;i<arr.length;i++)
      {
          if(i == k)
          {
              centered = arr[i][k];
          }
          rightsum = rightsum + arr[i][k];
          k--;
      }
      System.out.println(centered);
      int totalsum = 0;
      if(arr.length %2 == 0)
      {
          totalsum = leftsum + rightsum;
          System.out.println("The even length : " + totalsum);
      }
      else
      {
         totalsum = (leftsum + rightsum) - centered;
         System.out.println("The Odd length : " + totalsum);
      }
   }
}