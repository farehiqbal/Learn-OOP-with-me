package LAB5;
import java.util.Arrays;
import java.util.Scanner;


public class Book {
    
    String author;

    String chapterNames[] = new String[5];

    public Book(String author, String[] chapterNames) {
        this.author = author;
        this.chapterNames = chapterNames;
    }

    public Book() {
        this.author = null;
        this.chapterNames = null;
    }

    public Book(Book book){
        this.author = book.author;
        
        for (int i = 0; i < book.chapterNames.length; i++) {
            this.chapterNames[i] = book.chapterNames[i];
        }
    }

    public boolean comapreChapters(Book book){

        if(Arrays.equals(this.chapterNames, book.chapterNames)) return true;

        return false;
    }

    public void display(){

        System.out.println(this.author);

        for (int i = 0; i < chapterNames.length; i++) {
            System.out.println(chapterNames[i]);
        }

    }

    public void setValues(String newAuthor){

        Scanner input = new Scanner(System.in);
        
        this.author = newAuthor;

        for (int i = 0; i < chapterNames.length; i++) {
            chapterNames[i] = input.next();
        }
        input.close();
    }
    
    public boolean checkIfAuthorNameStartsWithA(){

        if (this.author.charAt(0) == 'A'){
            return true;
        }

        return false;
    }

    public boolean searchChapter(String chapterName){

        for (int i = 0; i < chapterNames.length; i++) {
            
            if(chapterNames[i] == chapterName){
                return true;
            }
        }

        return false;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getChapterNames() {
        return chapterNames;
    }

    public void setChapterNames(String[] chapterNames) {
        this.chapterNames = chapterNames;
    }

    

    
}
