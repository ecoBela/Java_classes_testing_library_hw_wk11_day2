import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Book> booklist;

    public Library(int capacity){
        this.capacity = capacity;
        this.booklist = new ArrayList<Book>();

    }

    public int getCapacity() {
        return this.capacity;
    }

    public int bookCount() {
        return this.booklist.size();
    }

    public void addBook(Book book) {
        if(bookCount() < this.capacity){
            this.booklist.add(book);
        }

    }
}
