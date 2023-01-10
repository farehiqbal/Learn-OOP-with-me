package Project.FileHandling;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileOperations {
    public static void writeToFile(Object obj, String fileName) {
        try {
            File f = new File(fileName);
            ObjectOutputStream oos;
            if (f.exists()) {
                oos = new MyObjectOutputStream(new FileOutputStream(f, true));
                // System.out.println("Inside if");
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(f));
                // System.out.println("Inside else");
            }

            oos.writeObject(obj);
            oos.close();
        } catch (IOException e) {
            System.out.println("IO Exception occured");
        }
    }

    public static void readFromFile(String fileName) {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
            while (true) {
                Object obj = (Object) ois.readObject();
                System.out.println(obj.toString());
            }

            // ois.close();
        } catch (ClassNotFoundException e) {
            // System.out.println("ClassNotFoundException");
        } catch (EOFException e) {
            // System.out.println("EOFException");
        } catch (IOException e) {
            // System.out.println("IOException");
        }
        
    }

    public static ArrayList<Object> readAllFromFile(String name) {
        ArrayList<Object> list = new ArrayList<Object>();

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(name));
            while (true) {
                Object s = (Object) ois.readObject();
                list.add(s);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        } catch (EOFException e) {
            // System.out.println("EOFException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
        return list;
    }
}
