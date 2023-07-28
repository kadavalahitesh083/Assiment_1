public class Pr2 
{
    public static void main(String[] args) 
    {
        String input = "cyber";
        boolean isPalindrome = isPalindrome(input);

        if (isPalindrome) 
        {
            System.out.println("The string is a palindrome.");
        } 
        else 
        {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String input) 
    {
        
        String cleanedInput = input.replaceAll("\\s+", "").toLowerCase();

       
        int left = 0;
        int right = cleanedInput.length() - 1;

        
        while (left < right) 
        {
            if (cleanedInput.charAt(left) != cleanedInput.charAt(right)) 
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
