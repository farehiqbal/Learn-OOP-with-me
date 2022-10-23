package LAB5;

import java.util.Arrays;
public class Student{
    String name;
    
    int Result[]= new int[5];
    
    
    
    Student(){
        name = "Ali";
        
        Result[0] = 65;
        Result[1] = 56;
        Result[2] = 67;
        Result[3] = 99;
        Result[4] = 88;
    }
    
    Student(String a,int []b){
        name = a;
       
        int len = 0;
        boolean check = length_verify(b);
        
        if(check == true){
            len = Result.length;
        }
        else{
            len = b.length;
        }
        
        for(int i=0; i<len ;i++){
            Result[i]=b[i];
        }
         
    }
    

    //copy constructor
    public Student(Student s){

        this.name = s.name;
        for(int i = 0; i<s.Result.length ; i++){
            this.Result[i] = s.Result[i];
        }
        
    }


    //equal data method
    public boolean equal_data(Student s){
        if((this.name== s.name) && ((Arrays.equals(this.Result , s.Result)))){
            return true;
        }
        else{
            return false;
        }

    }
    
    
    //compare averages
    public Student compare_average(Student s){
        if(this.cal_average()> s.cal_average()){
            return this;
        }
        else{
            return s;
        }
    }
    
    //setters 
    public void setName(String a){
        name = a;
    }
    
    public void setResult(int[]b){
        int len = 0;
        boolean check = length_verify(b);
        
        if(check == true){
            len = Result.length;
        }
        else{
            len = b.length;
        }
        
        for(int i=0; i<len ;i++){
            Result[i]=b[i];
        }
    }
    
    //getters
    public String getName(){
        return name;
    }
    
    
    public int[] getResult(){
        return Result;
    }
    
    //verify the length of array
    private boolean length_verify(int[] b){
        boolean j = true;
        
        if(b.length > Result.length){
            j = true;
        }
        else{
            j = false;
        }
        
        return j;
        
    }
    
    public void display(){
        System.out.println("NAME: "+name );
        System.out.println("MARKS: ");
        for(int i=0; i<Result.length; i++){
            System.out.print(Result[i] +" ");
        }
        
        
    }
    
    
   //average
    public double cal_average(){
        int marks = 0;
        for(int i=0; i<Result.length; i++){
            marks+= Result[i];
            
        }
        double average = marks / Result.length;
        return average;
    }
    
}



