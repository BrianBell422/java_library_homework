import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Book> borrowedBooks;

    public Borrower(String name) {
        this.name = name;
        this.borrowedBooks = new ArrayList<Book>();
    }

    public int bookCount() {
        return this.borrowedBooks.size();
    }



    public void borrowBook(Library library) {
        if(library.bookCount() > 0) {
            Book borrowedBook = library.removeFromBooks();
            this.addBook(borrowedBook);
        }
    }

    private void addBook(Book borrowedBook) {
        this.borrowedBooks.add(borrowedBook);
    }
}
