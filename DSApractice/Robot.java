class Robot
{
   public static int allpaths(int m,int n,int i,int j)
   {
      if(i==m-1 && j==n-1)
      {
         return 1;
      }
      if(i>=m || j>=n)
      {
         return 0;
      }
      int down = allpaths(m,n,i+1,j);
      int right = allpaths(m,n,i,j+1);
      return down+right;
   }
   public static void main(String[] args)
   {
      int m=3;
      int n=7;
      System.out.println(allpaths(m,n,0,0));
   }
}