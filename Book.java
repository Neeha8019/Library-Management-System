package L1;

import java.util.*;


public class Book {
	String bookId;
    String title;
    String author;
    boolean isAvailable;

    public Book(String bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void borrow() {
        isAvailable = false;
    }

    public void returnBook() {
        isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String toString() {
        return bookId + " - " + title + " by " + author + (isAvailable ? " [Available]" : " [Borrowed]");
    }
}


