public class Pr6 {
    public static void main(String[] args) 
    {
        String input = "Hello, World!";
        String reversed = reverseString(input);
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String input) 
    {
        
        char[] charArray = input.toCharArray();

        
        int left = 0;
        int right = charArray.length - 1;

       
        while (left < right) 
        {
          
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            
            left++;
            right--;
        }

     
        return new String(charArray);
    }
}
