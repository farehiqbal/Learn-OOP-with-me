package LAB6;

public class Date {
    private int day;
    private int month;
    private int year;

    
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public Date(Date d){
        this.day = d.day;
        this.month = d.month;
        this.year = d.year;
    }


    public int getDay() {
        return day;
    }


    public void setDay(int day) {
        this.day = day;
    }


    public int getMonth() {
        return month;
    }


    public void setMonth(int month) {
        this.month = month;
    }


    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + day;
        result = prime * result + month;
        result = prime * result + year;
        return result;
    }

    public boolean equalsDate(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Date other = (Date) obj;
        if (day != other.day)
            return false;
        if (month != other.month)
            return false;
        if (year != other.year)
            return false;
        return true;
    }

    

    
}
