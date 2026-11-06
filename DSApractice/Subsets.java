import java.util.*;
class Subsets
{
    static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> variations(int[] arr,List<Integer> list,boolean[] visited,List<List<Integer>> result)
    {
        if(list.size() == arr.length)
        {
            result.add(new ArrayList<>(list));
            return result;
        }
        for(int index=0;index<arr.length;index++)
        {
            if(!visited[index])
            {
               visited[index] = true;
               list.add(arr[index]);
               variations(arr, list, visited,result);
               list.remove(list.size()-1);
               visited[index] = false;
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        int[] arr = {1,2,3};
        boolean[] visited = new boolean[arr.length];
        List<Integer> list = new ArrayList<>();
        System.out.println(variations(arr, list,visited,result));
    }
}