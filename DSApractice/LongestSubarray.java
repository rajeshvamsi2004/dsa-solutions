public class LongestSubarray {
   public static void main(String[] args) {
       int[] arr = {4,1,1,1,2,3,5};
       int sum = 0;
       int left = 0;
       int k=5;
       int maxlen = 0;
       for(int right=0;right<arr.length;right++)
       {
          sum = sum + arr[right];
          while(sum > k)
          {
             sum = sum - arr[left];
             left++;
          }
          if(sum == k)
          {
             maxlen = Math.max(maxlen,right-left+1);
          }
       }
       System.out.println(maxlen);
   }
}
