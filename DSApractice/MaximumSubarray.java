public class MaximumSubarray {
   public static void main(String[] args) {
       int[] arr = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
       int count = 0;
       int k=3;
       int sum = 0;
       int left = 0;
       int maxsum = 0;
       for(int right=0;right<arr.length;right++)
       {
          count++;
          sum = sum + arr[right];
          if(count > k)
          {
             sum = sum - arr[left];
             left++;
          }
          maxsum = Math.max(maxsum,sum);
       }
       System.out.println(maxsum);
   }
}
