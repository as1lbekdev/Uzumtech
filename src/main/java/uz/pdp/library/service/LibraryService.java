package uz.pdp.library.service;

import uz.pdp.library.model.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class LibraryService {
    private final List<Library> books;

    public LibraryService() {
        this.books = new ArrayList<>();
    }


    public void addBook(Library book) {
        book.setBookId(UUID.randomUUID());
        books.add(book);
    }


    public List<Library> getAllBooks() {
        return books;
    }

    public Library searchBook(UUID bookId) {
        for (Library b : books) {
            if (b.getBookId().equals(bookId)) {
                return b;
            }
        }
        return null;
    }

    public boolean deleteBook(UUID bookId) {
        return books.removeIf(book -> book.getBookId().equals(bookId));
    }
}
