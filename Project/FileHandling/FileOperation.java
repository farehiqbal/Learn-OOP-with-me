package Project.FileHandling;

import java.io.*;

public class FileOperation<T> {

    String path;
    File file;

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
}