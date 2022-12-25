package LabAssignment3;

import java.io.*;
import java.util.ArrayList;

public class FileOperations {
    
    public static void writeToFile(Student s){

        try{
            File file = new File("test.ser");
            ObjectOutputStream oos;

            if(file.exists()){
                oos = new MyObjectOutputStream(new FileOutputStream(file, true));
            
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(file));
            }

            oos.writeObject(s);
            System.out.println("Write objet was called");
            oos.close();

        } catch(IOException e) {
            System.out.println("Error in file Writing");
        }
    }

    public static void readFromFile(){

        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"));
            while(true){
                Student e = (Student)ois.readObject();
                System.out.println(e.getName());

            }
        } catch(ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch(EOFException e) {
            System.out.println("End of file!");
        } catch(IOException e){
            System.out.println("Where'file"); 
        }

    }

    public static ArrayList <Student> readAllFromFile() throws IOException{

        ArrayList <Student> list = new ArrayList<Student> ();
        
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"));

            while (true){
                Student s = (Student)ois.readObject();
                list.add(s);
            }
        } catch(ClassNotFoundException c){
            System.out.println("class?");
        } finally{

        }
        
        return list;
    }

    public static boolean searchStudent(String _regNo) throws IOException{

        ArrayList<Student> list = readAllFromFile();

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getRegNo().equals(_regNo)) return true;
        }

        return false;
    }

    public static void deleteAStudent(String _regNo) throws IOException{

        ArrayList<Student> list = readAllFromFile();

        for (int i = 0; i < list.size(); i++) {
            
            if(list.get(i).getRegNo().equals(_regNo)){
                list.remove(i);
                break;
                
            }
        }
        
        
    }
}
