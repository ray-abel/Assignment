import java.util.Scanner;
 
public class DateTest {
    public static void main (String [] args) {
         
        Date show = new Date (0 ,0, 0);
 
        Scanner input = new Scanner (System.in);
         
        int month;
        int day;
        int year;
         
        System.out.print ("Enter Day: ");
        day = input.nextInt();
        show.setday(day);
         System.out.println ();

        System.out.print ("Enter Month: ");
        month = input.nextInt();
        show.setMonth(month);
         System.out.println ();
         
        System.out.print ("Enter Year: ");
        year = input.nextInt();
        show.setYear(year);
         System.out.println ();
         
        show.displayDate();
 
    }
}