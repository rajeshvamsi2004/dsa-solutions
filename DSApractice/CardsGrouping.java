import java.util.*;
class CardsGrouping
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,6,2,3,4,7,8};
        int groupsize = 3;
        List<Integer> list = new ArrayList<>();
        int count = 0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
            if(list.size() == groupsize)
            {
                boolean isdiff = true;
                for(int k=1;k<list.size();k++)
                {
                    if(list.get(k)-list.get(k-1) != 1)
                    {
                        isdiff = false;
                    }
                }
                list.clear();
                if(isdiff)
                {
                    count++;
                }
            }
        }
        if(count == arr.length/groupsize)
        {
           System.out.println(true);
        }
        else
        {
           System.out.println(false);
        }
    }
}