class Piles
{
   public static void main(String[] args) 
   {
       int[] pile = {3,6,7,11};
       int h = 8;
       int finalk = 0;
       for(int k=1;k<=11;k++)
       {
          int time = 0;
          for(int i=0;i<pile.length;i++)
          {
             int current = pile[i];
             time = time+(current+k-1)/k;
          }
          if(time <= h)
          {
             finalk = k;
             break;
          }
       }
       System.out.println(finalk);
   }   
}