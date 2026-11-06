class SmallestPositive
{
    public static void main(String[] args)
    {
        int[] arr = {3,4,-1,1};
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < 0)
            {
                continue;
            }
            else
            {
                int temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1] = temp;
            }
        }
        int missing = -1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < 0)
            {
               continue;
            }
            else
            {
                if(arr[i] != i+1)
                {
                    missing = arr[i];
                    break;
                }
            }
        }
        System.out.println(missing);
    }
}