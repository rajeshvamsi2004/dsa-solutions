class Total
{
   public static void main(String[] args) {
       int[] arr = {9, 6, 4, 2, 3, 5, 7, 0, 1};
       int sum = 0;
       for(int i=0;i<arr.length;i++)
       {
          sum = sum + arr[i];
       }
       int Missing = arr.length * (arr.length+1)/2 - sum;
       System.out.println(Missing);
   }
}