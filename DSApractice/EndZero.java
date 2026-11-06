class EndZero
{
    public static void main(String[] args)
    {
       int[] arr = {0,1,0,3,12};
       int nz=0;
       int z=0;
       while(nz<arr.length)
       {
          if(arr[nz] != 0 && arr[z] == 0)
          {
             int temp = arr[nz];
             arr[nz] = arr[z];
             arr[z] = temp;
             z++;
             nz++;
          }
          else if(arr[nz] == 0)
          {
             nz++;
          }
          else
          {
             z++;
          }
       }
       for(int i=0;i<arr.length;i++)
       {
          System.out.println(arr[i] + " ");
       }
    }
}