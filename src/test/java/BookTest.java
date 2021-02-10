import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class BookTest {
    private Book book;

    @Before
    public void before(){
        book = new Book("Scarlet", "A.Ripley", "Fiction");
    }

    @Test
    public void hasName(){
        assertEquals("Scarlet", book.getName());
    }

    @Test
    public void hasAuthor(){
        assertEquals("A.Ripley", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Fiction", book.getGenre());
    }
}
