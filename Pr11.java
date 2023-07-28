import java.util.HashSet;
import java.util.Set;

public class Pr11
{

    public static int countUniqueCharacters(String str) 
    {
    
        str = str.toLowerCase();

      
        Set<Character> uniqueCharacters = new HashSet<>();

       
        for (char c : str.toCharArray()) 
        {
            if (Character.isLetter(c)) 
            {
                uniqueCharacters.add(c);
            }
        }

    
        return uniqueCharacters.size();
    }

    public static void main(String[] args) 
    {
        String str1 = "python";
        String str2 = "java";

        int uniqueCharactersStr1 = countUniqueCharacters(str1);
        int uniqueCharactersStr2 = countUniqueCharacters(str2);

        System.out.println("Original String 1: " + str1);
        System.out.println("Number of unique characters in String 1: " + uniqueCharactersStr1);

        System.out.println("\nOriginal String 2: " + str2);
        System.out.println("Number of unique characters in String 2: " + uniqueCharactersStr2);
    }
}
