class SumPair
{
   public static void main(String[] args)
   {
       int[] arr = {1,2,3,4,5,6};
       int target = 7;
       int i=0;
       int j=arr.length-1;
       int sum=0;
       while(i < j)
       {
          sum = arr[i]+arr[j];
          if(sum == target)
          {
              System.out.print(arr[i]+"and" +arr[j]);
              i++;
              j--;
          }
          else if(sum > target)
          {
             j--;
          }
          else 
          {
             i++;
          }
       }
   }
}