class Nextpermutation
{
   public static void main(String[] args)
   {
      int[] arr = {1,2,3};
      int i = arr.length-2;
      int j = arr.length-1;
      while(i >= 0 && arr[i] >= arr[i+1])
      {
         i--;
      }
      while(arr[j] <= arr[i])
      {
         j--;
      }
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      for(int k=0;k<arr.length;k++)
      {
         System.out.print(arr[k] + " ");
      }
   }
}