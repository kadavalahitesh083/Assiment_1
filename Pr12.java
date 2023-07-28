public class Pr12 
{
    public static String shiftAlphabet(String input) 
    {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) 
        {
            char ch = charArray[i];

            
            if (ch >= 'a' && ch <= 'z') 
            {
                if (ch == 'z') 
                {
                    charArray[i] = 'a'; 
                } 
                else 
                {
                    charArray[i] = (char) (ch + 1); 
                }
            }

         
            else if (ch >= 'A' && ch <= 'Z')
             {
                if (ch == 'Z')
                {
                    charArray[i] = 'A';
                } 
                else 
                {
                    charArray[i] = (char) (ch + 1); 
                }
            }
        }

        return new String(charArray);
    }

    public static void main(String[] args) 
    {
        String input = "Hello, World!";
        String shiftedString = shiftAlphabet(input);
        System.out.println("Original string: " + input);
        System.out.println("Shifted string: " + shiftedString);
    }
}
