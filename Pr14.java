import java.util.Scanner;

public class Pr14 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :- ");
        int n = scanner.nextInt();
        scanner.close();

        if (n % 2 == 0) 
        {
            System.out.println("Please enter an number :-");
            return;
        }

        
        for (int i = 1; i <= n; i += 2) 
        {
            printSpaces((n - i) / 2);
            printStars(i);
            System.out.println();
        }

      
        for (int i = n - 2; i >= 1; i -= 2) 
        {
            printSpaces((n - i) / 2);
            printStars(i);
            System.out.println();
        }
    }


    private static void printSpaces(int count) 
    {
        for (int i = 0; i < count; i++) 
        {
            System.out.print("  ");
        }
    }

    private static void printStars(int count)
    {
        for (int i = 0; i < count; i++) 
        {
            System.out.print("* ");
        }
    }
}
