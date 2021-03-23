import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower borrower;
    Library library;
    Book book1;
    Book book2;

    @Before
    public void before() {
        borrower = new Borrower("Bob");
        library = new Library("Highland Library", 3);
        book1 = new Book("Bible", "Jesus", "Fantasy");
        book2 = new Book("Cook Book", "Chef", "Food");
        library.addBookToBooks(book1);
        library.addBookToBooks(book2);
    }

    @Test
    public void bobStartsWithNoBooks() {
        assertEquals(0, borrower.bookCount());
    }

    @Test
    public void bobCanBorrowBook() {
        borrower.borrowBook(library);
        assertEquals(1, borrower.bookCount());
        assertEquals(1, library.bookCount());
    }
}
