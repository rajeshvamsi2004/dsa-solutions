import java.util.*;
public class ProductArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int leftproduct = 1;
        int rightproduct = 1;
        int finalproduct = 0;
        List<Integer> result = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            int left = i-1;
            int right = i+1;
            leftproduct = 1;
            rightproduct = 1;
            finalproduct = 0;
            while(left >= 0)
            {
                leftproduct = leftproduct*arr[left];
                left--;
            }
            while(right < arr.length)
            {
               rightproduct = rightproduct*arr[right];
               right++;
            }
            finalproduct = leftproduct * rightproduct;
            result.add(finalproduct);
        }
        for(int val:result)
        {
           System.out.println(val + " ");
        }
    }
}
