package LAB5;

import javax.sound.sampled.SourceDataLine;

public class BookRunner {
    
    public static void main(String[] args) {
        
        String[] chapters = {"ch1", "ch2", "ch3", "ch4", "ch5"};

        Book book1 = new Book();
        Book book2 = new Book("Noob", chapters);

        Book book3 = new Book(book2);

        System.out.println(book2.comapreChapters(book3));

    }
}
