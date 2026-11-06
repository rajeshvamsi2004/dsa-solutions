import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        String s= "listen";
        String t = "silcnt";
        HashMap<Character,Integer> shm = new HashMap<>();
        HashMap<Character,Integer> thm = new HashMap<>();
        if(s.length() != t.length())
        {
           System.out.println("false");
           return;
        }
        for(int i=0;i<s.length();i++)
        {
           char current = s.charAt(i);
           if(shm.containsKey(current))
           {
              int count = shm.get(current);
              shm.put(current,count+1);
           }
           else
           {
              shm.put(current,1);
           }
        }
        for(int i=0;i<t.length();i++)
        {
           char current = t.charAt(i);
           if(thm.containsKey(current))
           {
              int tcount = thm.get(current);
              thm.put(current,tcount+1);
           }
           else
           {
              thm.put(current,1);
           }
        }
        if(shm.equals(thm))
        {
            System.out.println(true);
        }
        else
        {
           System.out.println(false);
        }
    }
}
