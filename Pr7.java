import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Pr7 
{
    public static void main(String[] args) 
    {
        
        int birthYear = 2000;
        int birthMonth = 8;
        int birthDay = 15;

       
        LocalDateTime now = LocalDateTime.now();

      
        LocalDate birthdate = LocalDate.of(birthYear, birthMonth, birthDay);

        
        Period period = Period.between(now.toLocalDate(), birthdate);
        long hours = now.until(birthdate.atStartOfDay(), ChronoUnit.HOURS);
        long minutes = now.until(birthdate.atStartOfDay(), ChronoUnit.MINUTES);
        long seconds = now.until(birthdate.atStartOfDay(), ChronoUnit.SECONDS);

       
        if (period.isNegative() || hours < 0 || minutes < 0 || seconds < 0) 
        {
            birthdate = birthdate.plusYears(1); 
            period = Period.between(now.toLocalDate(), birthdate);
            hours = now.until(birthdate.atStartOfDay(), ChronoUnit.HOURS);
            minutes = now.until(birthdate.atStartOfDay(), ChronoUnit.MINUTES);
            seconds = now.until(birthdate.atStartOfDay(), ChronoUnit.SECONDS);
        }

        
        System.out.println("Time remaining until your birthdate:");
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        System.out.println("Seconds: " + seconds);
    }
}
