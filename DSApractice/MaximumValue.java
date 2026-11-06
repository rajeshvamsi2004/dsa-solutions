public class MaximumValue {
    public static int maximum(int[] arr,int k,int xor)
    {
        int maxele = 0;
        for(int i=0;i<=k;i++)
        {
           int sum=0;
           for(int j=0;j<arr.length;j++)
           {
              sum = sum+(i^arr[j]);
           }
           maxele = Math.max(maxele,sum);
        }
        return maxele;
    }
    public static void main(String[] args)
    {
        int[] arr={1,6,3};
        int k=7;
        System.out.println(maximum(arr,k,0));
    }
}
