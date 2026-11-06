class Multiply
{
    public static void main(String[] args)
    {
        int[] arr = {-2,3,-4};
        int maxproduct = arr[0];
        int minproduct = arr[0];
        int allmax = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            int current = arr[i];
            int tempmax = maxproduct;
            maxproduct = Math.max(arr[i],Math.max(arr[i]*maxproduct,arr[i]*minproduct));
            minproduct = Math.min(arr[i],Math.min(arr[i]*minproduct,arr[i]*tempmax));
            allmax = Math.max(allmax,maxproduct);
        }
        System.out.println(allmax);
    }
}