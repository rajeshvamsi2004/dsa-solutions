class Birth
{
   public static void main(String[] args)
   {
      int[] arr = {0,1,1,2,1,9,9,5};
      StringBuilder sb = new StringBuilder();
      int day = arr[0]*10 + arr[1];
      int month = arr[2]*10+arr[3];
      for(int i=4;i<arr.length;i++)
      {
         sb.append(arr[i]);
      }
      String yearstring = sb.toString();
      int year = Integer.parseInt(yearstring);
      int dob = year * 10000 + month * 100 + day;
      int start = 1990*1000+2*100+1;
      int end = 1995*10000+2*12+1;
      boolean isbirth = (dob >= start && dob <= end);
      System.out.println(isbirth);
   }
}