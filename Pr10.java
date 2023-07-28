import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Pr10 
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first string:");
        String str1 = scanner.nextLine();

        System.out.println("Enter the second string:");
        String str2 = scanner.nextLine();

        boolean areAnagrams = checkAnagrams(str1, str2);

        if (areAnagrams) 
        {
            System.out.println("The two strings are anagrams of each other.");
        } 
        else 
        {
            System.out.println("The two strings are not anagrams of each other.");
        }

        scanner.close();
    }

    public static boolean checkAnagrams(String str1, String str2) 
    {
        
        String cleanedStr1 = str1.replaceAll("\\s+", "").toLowerCase();
        String cleanedStr2 = str2.replaceAll("\\s+", "").toLowerCase();

  
        if (cleanedStr1.length() != cleanedStr2.length()) 
        {
            return false;
        }

        
        Map<Character, Integer> freqMap1 = createFrequencyMap(cleanedStr1);
        Map<Character, Integer> freqMap2 = createFrequencyMap(cleanedStr2);

        
        return freqMap1.equals(freqMap2);
    }

    public static Map<Character, Integer> createFrequencyMap(String str) 
    {
        Map<Character, Integer> freqMap = new HashMap<>();

        for (char ch : str.toCharArray()) 
        {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        return freqMap;
    }
}
