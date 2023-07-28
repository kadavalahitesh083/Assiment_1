import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Pr9 
{
    public static void main(String[] args) 
    {
       
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter day, month, and year (in numbers):");
        int day = scanner.nextInt();
        int month = scanner.nextInt();
        int year = scanner.nextInt();

        
        LocalDate dateFromNumbers = LocalDate.of(year, month, day);
        System.out.println("Converted from numbers: " + dateFromNumbers);

        scanner.nextLine(); 

        
        System.out.println("Enter the date in the format (YYYY-MM-DD):");
        String dateString = scanner.nextLine();
    
        LocalDate dateFromString = LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("Converted from string: " + dateFromString);

        scanner.close();
    }
}
