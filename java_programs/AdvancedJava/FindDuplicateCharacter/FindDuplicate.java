
package FindDuplicateCharacter;


public class FindDuplicate 
{
    public static void main(String[] args) {
        String str = "programming";
        duplicate(str);
       
    }
    static void duplicate(String str)
    {
         for (int i = 0; i < str.length(); i++)
        {
            boolean isduplicate = false;
            
            for (int j = i+1; j < str.length(); j++) 
            {
                if(str.charAt(i)==str.charAt(j))
                {
                    isduplicate = true;
                    break;
                }
            }
            for(int k = 0; k < i; k++)
            {
                if(str.charAt(i) == str.charAt(k))
                {
                    isduplicate = false;
                    break;
                }
            }

            if(isduplicate)
            {
                System.out.println(str.charAt(i));
            }
            
        }
    }
}
