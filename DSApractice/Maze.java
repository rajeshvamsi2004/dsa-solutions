class Maze
{
   public static void paths(int[][] arr,int i,int j,String path)
   {
       if (i < 0 || j < 0 || i >= arr.length || j >= arr[0].length || arr[i][j] == 0)
            return;

        if (i == arr.length - 1 && j == arr[0].length - 1)
        {
            System.out.println(path);
            return;
        }
        arr[i][j] = 0;
        paths(arr,i,j+1,path+"L");
        paths(arr,i,j-1,path+"R");
        paths(arr,i-1,j,path+"U");
        paths(arr,i+1,j,path+"D");
        arr[i][j] = 1;
   }
   public static void main(String[] args)
   {
      int[][] arr = {
         {1,0,0,0},
         {1,1,0,1},
         {1,1,0,0},
         {0,1,1,1}
      };
      paths(arr,0,0,"");
   }
}