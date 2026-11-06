class Equilibrium
{
    public static void main(String[] args)
    {
        int[] arr = {1,3,5,2,2};
        boolean isequilibrium = false;
        for(int i=0;i<arr.length;i++)
        {
           int left = i-1;
           int leftsum=0;
           while(left >= 0)
           {
              leftsum = leftsum+arr[left];
              left--;
           }
           int right = i+1;
           int rightsum = 0;
           while(right < arr.length)
           {
              rightsum = rightsum+arr[right];
              right++;
           }
           if(leftsum == rightsum)
           {
              isequilibrium = true;
              System.out.println(i);
           }
        }
        if(!isequilibrium)
        {
           System.out.println(-1);
        }
    }
}