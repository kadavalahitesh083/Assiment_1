import java.util.Scanner;

public class Pr4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int minimum, maximum;

        System.out.println("Please Enter the Minimum & Maximum Values:");
        minimum = scanner.nextInt();
        maximum = scanner.nextInt();

        System.out.println("Prime Numbers Between " + minimum + " and " + maximum + " are:");
        for (int number = minimum; number <= maximum; number++) 
        {
            if (isPrime(number)) 
            {
                System.out.print(number + " ");
            }
        }

        scanner.close();
    }

    public static boolean isPrime(int number) 
    {
        if (number <= 1) 
        {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) 
        {
            if (number % i == 0) 
            {
                return false;
            }
        }

        return true;
    }
}
