package L1;

import java.util.*;


public class Member {
	String memberId;
    String name;
    List<Book> borrowedBooks = new ArrayList<>();

    public Member(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.borrow();
            borrowedBooks.add(book);
            System.out.println(name + " borrowed " + book.title);
        } else {
            System.out.println("Book is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.remove(book)) {
            book.returnBook();
            System.out.println(name + " returned " + book.title);
        } else {
            System.out.println("This book was not borrowed by " + name);
        }
    }

    public void getBorrowedBooks() {
        System.out.println(name + "'s Borrowed Books:");
        for (Book book : borrowedBooks) {
            System.out.println(book);
        }
    }
}



