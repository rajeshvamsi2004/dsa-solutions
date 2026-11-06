public class Robbery {
    public static int robbery(int i,int[] arr)
    {
       if(i>=arr.length)
       {
          return 0;
       }
       int rob = arr[i]+robbery(i+2,arr);
       int skip = robbery(i+1,arr);
       return Math.max(rob,skip);
    }
    public static void main(String[] args) {
        int[] arr = {2,7,9,3,1};
        System.out.println(robbery(0, arr));
    }
}
