import java.util.Scanner;

public class Pr1 {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number :- "); 
        int n = scanner.nextInt();
        scanner.close();

        if (n % 2 == 1) 
        {
            System.out.println("Weird");
        } 
        else 
        {
            if (n >= 2 && n <= 5) 
            {
                System.out.println("Not Weird");
            } 
            else if (n >= 6 && n <= 20)
            {
                System.out.println("Weird");
            } 
            else 
            {
                System.out.println("Not Weird");
            }
        }
    }
}
