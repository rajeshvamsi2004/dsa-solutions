class Prime
{
    public static void main(String[] args)
    {
        int n=30;
        for(int i=1;i<n;i++)
        {
            int j=1;
            int count = 0;
            while(j<n)
            {
               if(i%j == 0)
               {
                  count++;
               }
               j++;
            }
            if(count == 2)
            {
               System.out.print(i + " ");
            }
        }
    }
}