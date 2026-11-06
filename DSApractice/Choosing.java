class Choosing
{
   public static int choose(int[] arr,int i,int xor,int count)
   {
       if(count > arr.length/2)
       {
          return 0;
       }
       if(i==arr.length)
       {
          return xor;
       }
       int take = choose(arr,i+1,xor^arr[i],count+1);
       int skip = choose(arr,i+1,xor,count);
       return Math.max(take,skip);
   }
   public static void main(String[] args)
   {
      int n=4;
      int[] arr = {2,4,6,8};
      System.out.println(choose(arr,0,0,0));
   }
}