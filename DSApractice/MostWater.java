class MostWater 
{
   public static void main(String[] args)
   {
      int[] arr = {1,8,6,2,5,4,8,3,7};
      int i=0;
      int j=arr.length-1;
      int waterlevel = 0;
      int maxwaterlevel = 0;
      while(i<j)
      {
          waterlevel = Math.min(arr[i],arr[j]) * (j-i);
          maxwaterlevel = Math.max(maxwaterlevel,waterlevel);
          if(arr[i] < arr[j])
          {
             i++;
          }
          else
          {
            j--;
          }
      }
      System.out.println(maxwaterlevel);
   }
}