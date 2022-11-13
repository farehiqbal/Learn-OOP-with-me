package LAB6;

public class Book {
    private Person author;
    private String bookName;
    private String publisher;
    
    public Book() {
        
    }

    public Book(Person author, String bookName, String publisher) {
        this.author = new Person(author);
        this.bookName = bookName;
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "Book [author=" + author + ", bookName=" + bookName + ", publisher=" + publisher + "]";
    }

    

    
}
