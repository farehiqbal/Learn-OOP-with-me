package Project.FileHandling;

import java.io.*;
import java.util.ArrayList;

public class FileOperation<T> implements Serializable{

    String path;
    File file;

    FileOperation(){

    }

    public FileOperation(String path) {
        this.path = path + ".ser";
        file = new File(this.path);
    }

    public void push(T object) throws IOException {
        ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file));
        stream.writeObject(object);
        stream.close();
    }

    public T pull() throws ClassNotFoundException, IOException {
        
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file));
        @SuppressWarnings("unchecked")
        T object = (T) stream.readObject();
        stream.close();
        
        return object;
    }


    public boolean delete(T object) throws IOException, ClassNotFoundException {
        
        ObjectInputStream stream = new ObjectInputStream(new FileInputStream(file));
        @SuppressWarnings("unchecked")
        T del = (T) stream.readObject();
        stream.close();
        
        boolean flag= false;
        ArrayList<T> list = pullIterable();
        if(list.remove(del)) flag = true;
        
        for (T objects : list) {
            push(objects);
        }
        return flag;
    }

    public ArrayList<T> pullIterable(){
        
        ArrayList<T> list = new ArrayList<>();

        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            while (true) {
                @SuppressWarnings("unchecked")
                T s = (T) ois.readObject();
                list.add(s);
            }
        } catch (ClassNotFoundException e) {
            // System.out.println("ClassNotFoundException");
        } catch (EOFException e) {
            // System.out.println("EOFException");
        } catch (IOException e) {
            // System.out.println("IOException");
        }
        return list;

        
    }
}