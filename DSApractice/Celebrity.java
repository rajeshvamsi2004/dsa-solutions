class Celebrity
{
   public static void main(String[] args)
   {
      int[][] arr = {
          {0,1,1,0},
          {1,0,1,0},
          {0,0,0,0},
          {1,1,1,0}
      };
      for(int i=0;i<arr.length;i++)
      {
          for(int j=0;j<arr[0].length;j++)
          {
             if(arr[i][j] == 1)
             {
                boolean isstep1 = false;
                int count=1;
                for(int row=0;row<arr.length;row++)
                {
                    for(int col=0;col<arr[0].length;col++)
                    {
                       if(i != row && j == col && arr[row][col] == 1)
                       {
                           count++;
                       }
                    }
                }
                if(count == arr.length-1)
                {
                   isstep1 = true;
                }
                boolean isstep2=true;
                if(isstep1)
                {
                   for(int m=0;m<arr.length;m++)
                   {
                      if(m != j && arr[j][m] == 1)
                      {
                         isstep2 = true;
                         break;
                      }
                   }
                }
                if(isstep1 && isstep2)
                {
                    System.out.println(j);
                    return;
                }
             }
          }
      }
   }
}