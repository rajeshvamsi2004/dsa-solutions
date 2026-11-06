class CompileTime
{
    public int add(int a,int b)
    {
       return a+b;
    }
    public int add(int a,int b,int c)
    {
       return a+b+c;
    }
    public static void main(String[] args)
    {
        CompileTime c = new CompileTime();
        System.out.println(c.add(10,20));
        System.out.println(c.add(10,20,30));
    }
}