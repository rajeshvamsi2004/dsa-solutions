class Climbing
{
    public static int climbing(int i,int n)
    {
        if(i==n)
        {
           return 1;
        }
        if(i>n)
        {
          return 0;
        }
        int take = climbing(i+1,n);
        int skip = climbing(i+2,n);
        return take + skip;
    }
    public static void main(String[] args)
    {
        int n = 5;
        System.out.println(climbing(0,n));
    }
}