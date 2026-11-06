class Doublenumber
{
   public static void main(String[] args)
   {
      int[] arr = {1,3,4,2,2};
      int slow = arr[0];
      int fast = arr[arr[0]]; 
      while(slow != fast)
      {
         slow = arr[slow];
         fast = arr[arr[fast]];
      }
      int finder = 0;
      while(finder != slow)
      {
         finder = arr[finder];
         slow = arr[slow];
      }
      System.out.println(slow);
   }
}