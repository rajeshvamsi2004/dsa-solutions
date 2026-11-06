class Largestdiff
{
   public static void main(String[] args)
   {
      int[] arr = {5,2,8,1,9,3};
      int maxele = 0;
      for(int i=0;i<arr.length;i++)
      {
         int fixed = arr[i];
         int j=0;
         int subtract=0;
         while(j < arr.length)
         {
            subtract = fixed-arr[j];
            if(subtract > maxele)
            {
               maxele = subtract;
            }
            j++;
         }
      }
      System.out.println(maxele);
   }
}