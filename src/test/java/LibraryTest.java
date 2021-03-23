import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book1;
    Book book2;
    Book book3;

    @Before
    public void before() {
        library = new Library("Highland Library", 3);
        book1 = new Book("Bible", "Jesus", "Fantasy");
        book2 = new Book("Cook Book", "Chef", "Food");
        book3 = new Book("Fishing Book", "Fisherman", "Sport");
        library.addBookToBooks(book1);
        library.addBookToBooks(book2);
    }

    @Test
    public void countBooksInLibrary() {
        assertEquals(2, library.bookCount());
    }

    @Test
    public void addBookToLibrary() {
        library.addBookToBooks(book3);
        assertEquals(3, library.bookCount());
    }

    @Test
    public void cannotAddBookToLibrary() {
        library.addBookToBooks(book3);
        library.addBookToBooks(book3);
        assertEquals(3, library.bookCount());
    }
}
