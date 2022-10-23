package AssignmentOne;

public class Student {
    
    private String name;
    private String regNO;
    private float marks;


    public Student() {

    }


    public Student(String name, String regNO, float marks) {
        this.name = name;
        this.regNO = regNO;
        this.marks = marks;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegNO() {
        return regNO;
    }

    public void setRegNO(String regNO) {
        this.regNO = regNO;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }


    

    @Override
    public String toString() {
        return "Student [name=" + name + ", regNO=" + regNO + ", marks=" + marks + "]";
    }


    public char grade(){

        float percentage = (this.marks/500)*100;

        if (percentage>=90)
	        return 'A';

	    else if(percentage >=80 && percentage <90)
            return 'B';

	    else if(percentage >=70 && percentage <80)
	        return 'C';

        else if(percentage>=60 && percentage <70)
            return 'D';

        else
            return 'F';


    }

    
}
