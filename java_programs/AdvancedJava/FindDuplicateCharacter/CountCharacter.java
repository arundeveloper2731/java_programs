
package FindDuplicateCharacter;


public class CountCharacter 
{
    public static void main(String[] args) {
        String str = "banana";
        countChar(str);
        
    }
    static void countChar(String str)
    {
        for(int i = 0; i < str.length(); i++)
        {
            int count = 1;

            boolean alreadyCounted = false;

            for(int k = 0; k < i; k++)
            {
                if(str.charAt(i) == str.charAt(k))
                {
                    alreadyCounted = true;
                    break;
                }
            }

            if(alreadyCounted)
            {
                continue;
            }

            for(int j = i + 1; j < str.length(); j++)
            {
                if(str.charAt(i) == str.charAt(j))
                {
                    count++;
                }
            }

            System.out.println(str.charAt(i) + " : " + count);
        }
    }
}
