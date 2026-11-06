class Sessions
{
    public static void main(String[] args)
    {
        String[] arr = {
            "U1:150:LOGOUT",
            "U1:100:LOGIN",
            "U2:110:LOGIN",
            "U2:200:LOGOUT",
            "U1:300:LOGIN",
            "U1:350:LOGOUT"
        };
        boolean[] visited = new boolean[arr.length];
        int user1val=0;
        int user2val=0;
        for(int i=0;i<arr.length;i++)
        {
            visited[i] = true;
            String current = arr[i]; 
            String[] splitarr = current.split(":");
            String username = splitarr[0];
            int time = Integer.parseInt(splitarr[1]);
            String session = splitarr[2];
            for(int j=i+1;j<arr.length;j++)
            {
               String jcurrent = arr[j];
               String[] jsplitarr = jcurrent.split(":");
               String jusername = jsplitarr[0];
               int jtime = Integer.parseInt(jsplitarr[1]);
               String jsession = jsplitarr[2];
               if(username.equals(jusername) && !session.equals(jsession))
               {
                  if(visited[j])
                  {
                     break;
                  }
                  visited[j] = true;
                  if(username.equals("U1"))
                  {
                     user1val=user1val+(Math.abs(time-jtime));
                  }
                  else
                  {
                     user2val = user2val+(Math.abs(time-jtime));
                  }
               }
            }
        }
        System.out.println(user1val);
        System.out.println(user2val);
    }
}