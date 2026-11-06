class Pair
{
   public static void main(String[] args)
   {
       int[] arr = {1,2,3,4,5,6,7};
       int i=0;
       int j=arr.length-1;
       int target=10;
       while(i < j)
       {
          int sum = arr[i]+arr[j];
          if(sum == target)
          {
              System.out.println(arr[i] + " " + arr[j]);
              i++;
              j--;
          }
          else if(sum < target)
          {
             i++;
          }
          else
          {
             j--;
          }
       }
   }
}