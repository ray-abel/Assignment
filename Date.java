public class Date {
 
    private int day;
    private int month;
    private int year;
     
    public Date (int month, int day, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
     
    public void setMonth (int month) {
        month = month;
    }
     
    public int getMonth() {
        return month;
    }
     
    public void setday (int day) {
        day = day;
    }
     
    public int getDay() {
        return day;
    }
     
    public void setYear (int year ) {
        year = year;
    }
     
    public int getYear() {
        return year;
    }
     
    public void displayDate () {
        System.out.printf ("%d/%d/%d\n", getMonth(), getDay(), getYear());
    }
 
}