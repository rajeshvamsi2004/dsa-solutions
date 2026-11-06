

class ProductMinimum
{
    public static int minimum(int[] arr)
    {
        int negcount = 0;
        int zerocount = 0;
        int operations = 0;
        for(int i=0;i<arr.length;i++)
        {
           int current = arr[i];
           if(current < 0)
           {
              operations = operations+(-1-current);
              negcount++;
           }
           else if(current > 0)
           {
              operations = operations+(current-1);
           }
           else 
           {
              operations = operations+1;
              zerocount++;
           }
        }
        if(negcount%2 != 0 && zerocount==0)
        {
           operations = operations+2;
        }
        return operations;
    }
    public static void main(String[] args)
    {
       int[] arr = {-1,-2,-3,0};
       System.out.println(minimum(arr));
    }
}