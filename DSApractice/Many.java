import java.util.*;
class Many
{
   static List<Integer> list = new ArrayList<>();
   static List<List<Integer>> result = new ArrayList<>();
   public static List<List<Integer>> many(int n,int k,List<List<Integer>> result)
   {
       if(k<=0)
       {
          result.add(new ArrayList<>(list));
          return result;
       }
       int start = 1;
       if(list.size() > 0)
       {
          start = list.get(list.size()-1);
       }
       for(int i=start;i<=n;i++)
       {
           if(i%start == 0)
           {
              list.add(i);
              many(n,k-1,result);
              list.remove(list.size()-1);
           }
       }
       return result;
   }
   public static void main(String[] args)
   {
      int n = 2;
      int k=2;
      System.out.println((many(n,k,result)).size());
      
   }
}