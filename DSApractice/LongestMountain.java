class LongestMountain
{
    public static void main(String[] args)
    {
        int[] arr = {2,1,4,7,3,2,5};
        int right=0;
        int left=0;
        int mid=0;
        int maxlen = 0;
        while(right < arr.length-1)
        {
            while(right < arr.length-1 && arr[right] < arr[right+1])
            {
                right++;
                mid++;
            }
            if(mid == left)
            {
               right++;
               left=right;
               mid=right;
               continue;
            }
            while(mid < arr.length-1 && arr[mid] > arr[mid+1])
            {
              mid++;
            }
            if(mid == right)
            {
                left = right;
                right++;
                mid = right;
                continue;
            }
            maxlen = Math.max(maxlen,mid-left+1);
            left = mid;
            right = mid;
        }
        System.out.println(maxlen);
    }
}