package Lab_Assignment3;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class FileOperations {
    public static void writeToFile(Student_lab s) {
        try {
            File f = new File("test.ser");
            ObjectOutputStream oos;
            if (f.exists()) {
                oos = new MyObjectOutputStream(new FileOutputStream(f, true));
                // System.out.println("Inside if");
            } else {
                oos = new ObjectOutputStream(new FileOutputStream(f));
                // System.out.println("Inside else");
            }

            oos.writeObject(s);
            oos.close();
        } catch (IOException e) {
            System.out.println("IO Exception occured");
        }
    }

    public static void readFromFile() {
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.ser"));
            while (true) {
                Student_lab s = (Student_lab) ois.readObject();
                System.out.println(s.toString());
            }

            // ois.close();
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException");
        } catch (EOFException e) {
            System.out.println("EOFException");
        } catch (IOException e) {
            System.out.println("IOException");
        }
        System.out.println("=============");
    }

    public static ArrayList<Student_lab> readAllFromFile(String name) {
        ArrayList<Student_lab> list = new ArrayList<Student_lab>();

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(name));
            while (true) {
                Student_lab s = (Student_lab) ois.readObject();
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

    public static Boolean SearchStudent(String reg, String fname) {
        ArrayList<Student_lab> list = readAllFromFile(fname);

        for (Student_lab ob : list) {
            if (ob.getReg_no().equals(reg)) {
                System.out.println("Student Found");
                return true;
            }
        }
        System.out.println("Student not Found");
        return false;
    }

    public static void DeleteAStudent(String reg, String fname) throws IOException {
        ArrayList<Student_lab> list = readAllFromFile(fname);
        for (Student_lab ob : list) {
            if (ob.getReg_no().equals(reg)) {
                list.remove(ob);
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname));
                for (Student_lab j : list) {
                    oos.writeObject(j);
                }
                return;
            }
        }
        System.out.println("NOt Found Baby");

    }

    public static void UpdateReg(String reg, String fname, String newReg) {
        ArrayList<Student_lab> list = readAllFromFile(fname);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getReg_no().equals(reg)) {
                list.get(i).setReg_no(newReg);
                try {
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname));
                    for (Student_lab j : list) {
                        oos.writeObject(j);
                    }
                    return;
                } catch (IOException e) {

                }

            }
        }
        System.out.println("NOt Found Baby");

    }

    public static void UpdateEmail(String email, String fname, String newE) {
        ArrayList<Student_lab> list = readAllFromFile(fname);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getEmail().equals(email)) {
                list.get(i).setReg_no(newE);
                try {
                    ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname));
                    for (Student_lab j : list) {
                        oos.writeObject(j);
                    }
                    return;
                } catch (IOException e) {
                }
            }
        }
        System.out.println("NOt Found Baby");

    }

    public static int CountAllStudentsOnProb(String fname) {
        ArrayList<Student_lab> list = readAllFromFile(fname);
        int count = 0;
        for (Student_lab ob : list) {
            if (ob.getGPA() < 2) {
                count++;
            }
        }
        return count;
    }

    public static void DisplayAllStudentsInDepartment(String fname, String dep) {
        ArrayList<Student_lab> list = readAllFromFile(fname);

        for (Student_lab ob : list) {
            if (ob.getDep().equals(dep)) {
                System.out.println(ob.getName());
            }
        }
    }

    public static void DeleteAllStudentsInDepartment(String fname, String dep) {
        ArrayList<Student_lab> list = readAllFromFile(fname);

        for (Student_lab ob : list) {
            if (ob.getDep().equals(dep)) {
                list.remove(ob);
            }
        }
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fname));
            for (Student_lab j : list) {
                oos.writeObject(j);
            }
            return;
        } catch (IOException e) {

        }
    }
}
