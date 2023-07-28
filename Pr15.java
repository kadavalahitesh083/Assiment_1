import java.util.Arrays;

public class Pr15 
{
    public static void main(String[] args) 
    {
        String inputString = "python";

        String sortedString = sortCharacters(inputString);
        System.out.println("Original String: " + inputString);
        System.out.println("Sorted String: " + sortedString);
    }

    public static String sortCharacters(String inputString) 
    {

        String cleanString = inputString.replaceAll("[^a-zA-Z]", "");

  
        char[] charArray = cleanString.toCharArray();

        Arrays.sort(charArray);

        return new String(charArray);
    }
}
