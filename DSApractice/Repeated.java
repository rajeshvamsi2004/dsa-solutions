class Repeated
{
    public static void main(String[] args)
    {
        int[] arr = {1,3,4,2,2};
        int slow = 0;
        int fast = 1;
        while(slow != fast)
        {
            slow = arr[slow];
            fast = arr[arr[fast]];
            if(slow == fast)
            {
               System.out.println(slow);
               break;
            }
        }
    }
}