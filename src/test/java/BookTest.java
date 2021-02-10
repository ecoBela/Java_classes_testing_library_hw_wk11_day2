import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
}
