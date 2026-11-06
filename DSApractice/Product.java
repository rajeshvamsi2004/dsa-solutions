class Product
{
   public static void main(String[] args)
   {
      int[] arr = {1,2,3,4};
      int[] result = new int[arr.length];
      int product = 1;
      int[] left = new int[arr.length];
      for(int i=0;i<arr.length;i++)
      {
          result[i] = product;
          product = product * arr[i];
      }
      int rproduct = 1;
      for(int i=arr.length-1;i>=0;i--)
      {
         result[i] = result[i] * rproduct;
         rproduct = rproduct * arr[i];
      }
      for(int i=0;i<result.length;i++)
      {
         System.out.print(result[i] + " ");
      }
   }
}