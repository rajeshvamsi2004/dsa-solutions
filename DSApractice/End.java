class End
{
    public static void main(String[] args)
    {
        int[] arr = {20,0,200,2,0,0,50,26,0};
        int i=0;
        int j=0;
        while(i < arr.length || i < arr.length)
        {
            if( arr[i] !=0 && arr[j] != 0)
            {
                i++;
                j++;
            }
            else if(arr[i] == 0)
            {
                i++;
            }
            else
            {
               int temp = arr[i];
               arr[i] = arr[j];
               arr[j] = temp;
               i++;
               j++;
            }
        }
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k] + " ");
        }
    }
}