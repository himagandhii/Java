import java.util.Calendar;
public class Calend
{
    public static void main(String[] args)
    {
         Calendar  calendar = Calendar.getInstance();
         System.out.println("The current date: " + calendar.getTime());
         System.out.println("Present Year: " + calendar.get(Calendar.YEAR));
         calendar.add(Calendar.DATE, -15);
         System.out.println("15 Days ago: " + calendar.getTime());
         calendar.add(Calendar.MONTH,4);
         System.out.println("4 months later: " + calendar.getTime());
         calendar.add(Calendar.YEAR,2);
         System.out.println("2 years later: " + calendar.getTime());
         System.out.println("Present year: " + calendar.get(Calendar.YEAR));
         int max = calendar.getMaximum(Calendar.DAY_OF_WEEK);
         System.out.println("Maximum days of week: " + max);

    }
}