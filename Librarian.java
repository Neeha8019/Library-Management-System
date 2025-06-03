package L1;

import java.util.*;


public class Librarian {
	String librarianId;
    String name;
    List<Book> catalog = new ArrayList<>();
    List<Member> members = new ArrayList<>();

    public Librarian(String librarianId, String name) {
        this.librarianId = librarianId;
        this.name = name;
    }

    public void addBook(Book book) {
        catalog.add(book);
        System.out.println("Book added: " + book);
    }

    public void removeBook(Book book) {
        catalog.remove(book);
        System.out.println("Book removed: " + book.title);
    }

    public void registerMember(Member member) {
        members.add(member);
        System.out.println("Member registered: " + member.name);
    }

    public List<Book> getCatalog() {
        return catalog;
    }
}


