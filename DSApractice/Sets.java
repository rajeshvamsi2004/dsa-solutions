import java.util.*;
class Sets
{
    static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> elements(int[] arr,int i,List<Integer> list, List<List<Integer>> result)
    {
        if(i == arr.length)
        {
           result.add(new ArrayList<>(list));
           return result;
        }
        list.add(arr[i]);
        elements(arr,i+1,list,result);
        list.remove(list.size()-1);
        elements(arr,i+1,list,result);
        return result;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3};
        List<Integer> list = new ArrayList<>();
        System.out.println(elements(arr, 0, list, result));
    }
}