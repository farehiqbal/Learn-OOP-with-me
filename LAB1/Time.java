// lab task 2.

// import java.time.LocalTime;


public class Time {
    public static int hours;
    public static int minutes;
    public static int seconds;

    public static void setTime(int h, int m, int s){
        hours = h;
        minutes = m;
        seconds = s;
    }

    public void DisplayTIme(){
        System.out.println(hours +"hrs "+  minutes + "min "+ seconds + "sec");
    }

    public static void main(String[] args) {
        Time time = new Time();
        setTime(23,55,30);
        time.DisplayTIme();
    }

}
