import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Book> books;
    private int capacity;

    public Library(String name, int capacity) {
        this.name = name;
        this.books = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int bookCount() {
       return this.books.size();
    };

    public void addBookToBooks(Book book) {
        if (this.bookCount() < this.capacity) {
            this.books.add(book);
        }
    }

    public Book removeFromBooks() {
        Book bookRemoved = null;
        if(this.bookCount() > 0) {
            bookRemoved = this.books.remove(0);
        }
        return bookRemoved;
    }
}
