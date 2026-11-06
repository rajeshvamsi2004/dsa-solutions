class ReversingVowels
{
    public static void main(String[] args)
    {
        String s="IceCreAm";
        char[] letters = s.toCharArray();
        int i=0;
        int j=s.length()-1;
        while(i<j)
        {
            boolean isi = false;
            while(i < j)
            {
                int currenti = letters[i];
                if(currenti == 'A' || currenti == 'E' || currenti == 'I' || currenti == 'O' || currenti == 'U')
                {
                    isi = true;
                    break;
                } 
                i++;
            }
            boolean isj = false;
            while(j > i)
            {
                int currentj = letters[j];
                if(currentj == 'A' || currentj == 'E' || currentj == 'I' || currentj == 'O' || currentj == 'U')
                {
                    isj = true;
                    break;
                }
                j--;
            }
            if(isi && isj)
            {
                char temp = letters[i];
                letters[i] = letters[j];
                letters[j] = temp;
                i++;
                j--;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char ch:letters)
        {
           sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}