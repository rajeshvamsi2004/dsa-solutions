class Lefttraverse
{
   public static void main(String[] args)
   {
      int[] arr = {2,3,1,2,4,3,5};
      int mincount = Integer.MAX_VALUE;
      int updateelement = 0;
      for(int i=0;i<arr.length;i++)
      {
          int fixed = arr[i];
          int j=i+1;
          int count = 0;
          boolean isdup = false;
          while(j < arr.length)
          {
              count++;
              if(fixed == arr[j])
              {
                  isdup = true;
                  break;
              }
              j++;
          }
          if(count < mincount && count > 1 && isdup)
          {
              mincount = count;
              updateelement = fixed;
          }
      }
      System.out.println(updateelement);
   }
}