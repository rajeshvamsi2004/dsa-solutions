class Maxproduct
{
   public static void main(String[] args)
   {
      int[] arr = {2,3,-2,4};
      int maxproduct = 1;
      int minproduct = 1;
      int result = arr[0];
      for(int i=0;i<arr.length;i++)
      {
          int tempMax = maxproduct;
          int tempMin = minproduct;
          maxproduct = Math.max(arr[i],Math.max(arr[i] * tempMax,arr[i] * tempMin));
          minproduct = Math.min(arr[i],Math.min(arr[i] * tempMax,arr[i] * tempMin));
          result = Math.max(result,maxproduct);
      }
      System.out.println(result);
   }
}