class ProductElements
{
   public static void main(String[] args)
   {
      int[] arr = {1,2,3,4};
      int[] leftarr = new int[arr.length];
      leftarr[0] = 1;
      int leftproduct = 1;
      for(int i=1;i<arr.length;i++)
      {
         leftproduct = leftproduct*arr[i-1];
         leftarr[i] = leftproduct;
      }
      int[] rightarr = new int[arr.length];
      rightarr[arr.length-1] = 1;
      int rightproduct = 1;
      for(int i=arr.length-2;i>=0;i--)
      {
         rightproduct = rightproduct * arr[i+1];
         rightarr[i] = rightproduct;
      }
      int[] resultarr = new int[leftarr.length];
      for(int i=0;i<leftarr.length;i++)
      {
         resultarr[i] = leftarr[i] * rightarr[i];
      }
      for(int i=0;i<resultarr.length;i++)
      {
         System.out.print(resultarr[i] + " ");
      }
   }
}