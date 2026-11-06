public class Trappingrain {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        int maxwater = 0;
        int water = 0;
        for(int i=0;i<arr.length;i++)
        {
            int current = arr[i];
            int leftmax = 0;
            int rightmax = 0;
            int left = i-1;
            int right = i+1;
            while(left>=0)
            {
               if(arr[left] > leftmax)
               {
                   leftmax = arr[left];
               }
               left--;
            }
            while(right < arr.length)
            {
               if(arr[right] > rightmax)
               {
                  rightmax = arr[right];
               }
               right++;
            }
            water = Math.min(leftmax,rightmax) - current;
            if(water > 0)
            {
               maxwater = maxwater + water;
            }
        }
        System.out.println(maxwater);
    }
}
