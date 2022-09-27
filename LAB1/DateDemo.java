public class DateDemo {
    public static void main(String[] args) {
        
        Date date1 = new Date();
        date1.month = "December";
        date1.day = 31;
        date1.year = 2012;

        System.out.print("Date1: ");
        date1.displayDate();

        Date date2 = new Date();
        date2.month = "July";
        date2.day = 4;
        date2.year = 1776;

        System.out.print("Date2: ");
        date2.displayDate();

    }
}
