package L1;

import java.util.Scanner;

public class LibraryManagementSystem {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Librarian librarian = new Librarian("L1", "Alice");

        Book book1 = new Book("B1", "1984", "George Orwell");
        Book book2 = new Book("B2", "To Kill a Mockingbird", "Harper Lee");

        librarian.addBook(book1);
        librarian.addBook(book2);

        Member member = new Member("M1", "John Doe");
        librarian.registerMember(member);

        int choice;
        do {
            System.out.println("\n1. View Books\n2. Borrow Book\n3. Return Book\n4. View Borrowed Books\n5. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
            
                case 1:
                    for (Book book : librarian.getCatalog()) {
                        System.out.println(book);
                    }
                    break;
                    
                case 2:
                    System.out.print("Enter Book ID to borrow: ");
                    String borrowId = scanner.nextLine();
                    for (Book book : librarian.getCatalog()) {
                        if (book.bookId.equals(borrowId)) {
                            member.borrowBook(book);
                            break;
                        }
                    }
                    break;
                    
                case 3:
                    System.out.print("Enter Book ID to return: ");
                    String returnId = scanner.nextLine();
                    for (Book book : librarian.getCatalog()) {
                        if (book.bookId.equals(returnId)) {
                            member.returnBook(book);
                            break;
                        }
                    }
                    break;
                    
                case 4:
                    member.getBorrowedBooks();
                    break;
                    
                case 5:
                    System.out.println("Exiting system...");
                    break;
                    
                default:
                    System.out.println("Invalid option.");
            }
            
        } while (choice != 5);

        scanner.close();
    }
}


