class Rotate
{
   public static int rotateandfind(int[] arr,int D,int K)
   {
      int[] result = new int[arr.length];
      int j=0;
      D = D%arr.length;
      for(int i=arr.length-D;i<arr.length;i++)
      {
         result[j++] = arr[i];
      }
      for(int i=0;i<arr.length-D;i++)
      {
         result[j++] = arr[i];
      }
      return result[K];
   }
   public static void main(String[] args) {
       int[] arr = {1,2,3,4,5};
       int D=2;
       int K=0;
       System.out.println(rotateandfind(arr, D, K));
   }
}