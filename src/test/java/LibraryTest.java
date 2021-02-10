import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book;

    @Before
    public void before(){
        library = new Library(2);
        book = new Book("Gone With The Wind", "Margaret Mitchell", "Fiction");
    }
    @Test
    public void hasCapacity(){
        assertEquals(2, library.getCapacity());
    }

    @Test
    public void checkNumberOfBooks(){
        assertEquals(0, library.bookCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void cannotAddBookIfLibraryFull(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.bookCount());
    }

}
