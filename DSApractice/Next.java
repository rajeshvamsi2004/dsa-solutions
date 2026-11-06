class Next
{
    public static void main(String[] args)
    {
        int[] arr = {4,5,2,10,8};
        int[] result = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            boolean isgreater = false;
            int j=i+1;
            while(j < arr.length)
            {
                if(arr[j] > arr[i])
                {
                    isgreater = true;
                    break;
                }
                j++;
            }
            if(isgreater)
            {
                result[i] = arr[j];
            }
            else
            {
                result[i] = -1;
            }
        }
        for(int i=0;i<result.length;i++)
        {
           System.out.print(result[i] + " ");
        }
    }
}