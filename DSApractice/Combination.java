import java.util.*;
class Combination
{
   static List<List<Integer>> result = new ArrayList<>();
   public static List<List<Integer>> targetsum(int[] arr,int target,int i,int sum,List<Integer> list,List<List<Integer>> result)
   {
       if(sum == target)
       {
          result.add(new ArrayList<>(list));
          return result;
       }
       if(i == arr.length || sum > target)
       {
          return result;
       }
       list.add(arr[i]);
       targetsum(arr,target,i,sum+arr[i],list,result);
       list.remove(list.size()-1);
       targetsum(arr,target,i+1,sum,list,result);
       return result; 
   }
   public static void main(String[] args)
   {
      int[] arr = {2,3,6,7};
      int target = 7;
      List<Integer> list = new ArrayList<>();
      System.out.println(targetsum(arr, target, 0, 0, list, result));
   }
}