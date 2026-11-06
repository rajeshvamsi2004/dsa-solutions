import java.util.*;
class CarFleet
{
    public static void main(String[] args)
    {
        int target = 12;
        int[] position = {10,8,0,5,3};
        int[] speed = {2,4,1,1,3};
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<position.length;i++)
        {
            for(int j=i+1;j<position.length;j++)
            {
                if(position[j] > position[i])
                {
                    int temp = position[i];
                    position[i] = position[j];
                    position[j] = temp;

                    int temp2 = speed[i];
                    speed[i] = speed[j];
                    speed[j] = temp2;
                }
            }
        }
        for(int i=0;i<position.length;i++)
        {
            int current = (target - position[i])/speed[i];
            if(stack.isEmpty())
            {
                stack.push(current);
            }
            else if(!stack.isEmpty() && current > stack.peek())
            {
                stack.push(current);
            }
            else
            {
                continue;
            }
        }
        System.out.println(stack.size());
    }
}