import java.util.Scanner;

class HeartRateTest{
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter last name: ");
        String lastName = input.nextLine();

        System.out.print("Enter year of birth: ");
        int year = input.nextInt();

        System.out.print("Enter month of birth: ");
        int month = input.nextInt();

        System.out.print("Enter day of birth: ");
        int day = input.nextInt();

        System.out.print("Enter current year: ");
        int currentYear = input.nextInt();

        HeartRates heart = new HeartRates(firstName, lastName, year, month, day);
        System.out.println();

        System.out.println(heart.getfirstName() +" "+ heart.getlastName() +" "+ heart.getYear() +" "+ heart.getMonth() +" "+ heart.getDay());

        heart.displayDate(year, month, day);
        System.out.println("Age is: " + heart.calculateAge(currentYear));
        System.out.println("Maximun Heart Rate is: " + heart.calMaxHeartRates());
        System.out.println("Target Heart rate range between: " + heart.calLowerTargetRate() + " and " + heart.calHigerTargetRate());
        
        
    }
}
