package uz.pdp.library;

import uz.pdp.library.model.Library;
import uz.pdp.library.service.LibraryService;

import java.util.List;
import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Library Page");
        LibraryService libraryService = new LibraryService();
        while (true) {

            System.out.println("""
                    =====================
                        0. Exit
                        1. Add Book
                        2. About Book
                        3. Delete Book
                        4. All Books
                    =====================
                    """);

            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 0->{
                    System.out.println("Good Bye!");
                    return;
                }
                case 1->{
                    Library library = new Library();

                    System.out.println("Enter Book Name:");
                    library.setBookName(sc.nextLine());

                    System.out.println("Enter Book Author:");
                    library.setAuthor(sc.nextLine());

                    System.out.println("Enter Book about:");
                    library.setAboutBook(sc.nextLine());

                    libraryService.addBook(library);
                    System.out.println("Book added successfully with ID: " + library.getBookId());
                    break;
                }

                case 2->{
                    System.out.println("Enter Book ID (UUID):");
                    String inputId = sc.nextLine();
                    try {
                        UUID bookId = UUID.fromString(inputId);
                        Library book = libraryService.searchBook(bookId);
                        if (book != null) {
                            System.out.println(book);
                        } else {
                            System.out.println("Book not found!");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid UUID format!");
                    }
                }
                case 3->{
                    System.out.println("Enter Book ID (UUID) to delete:");
                    String inputId = sc.nextLine();
                    try {
                        UUID bookId = UUID.fromString(inputId);
                        boolean deleted = libraryService.deleteBook(bookId);
                        if (deleted) {
                            System.out.println("Book deleted successfully.");
                        } else {
                            System.out.println("Book not found.");
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Invalid UUID format!");
                    }

                }
                case 4 -> {
                    List<Library> allBooks = libraryService.getAllBooks();
                    if (allBooks.isEmpty()) {
                        System.out.println("No books found.");
                    } else {
                        for (Library book : allBooks) {
                            System.out.println(book);
                        }
                    }
                }
                default -> System.out.println("Invalid choice!");

            }

        }

    }
}
