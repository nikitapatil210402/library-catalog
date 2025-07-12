package com.library.catalog.service;

import com.library.catalog.model.Book;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class BookService {

    private final Map<Integer, Book> bookStore = new HashMap<>();
    private int currentId = 1;

    public Book addBook(Book book) {
        if (book.getTitle() == null || book.getTitle().trim().isEmpty()) {
            throw new IllegalArgumentException("Book title cannot be empty.");
        }

        if (book.getAuthor() == null || book.getAuthor().trim().isEmpty()) {
            throw new IllegalArgumentException("Author name cannot be empty.");
        }

        if (book.getIsbn() == null || book.getIsbn().trim().length() < 5) {
            throw new IllegalArgumentException("ISBN must be at least 5 characters.");
        }

        book.setId(currentId++);
        book.setAvailable(true);
        bookStore.put(book.getId(), book);
        return book;
    }


    public List<Book> getAllBooks() {
        return new ArrayList<>(bookStore.values());
    }

    public Book getBookById(int id) {
        return bookStore.get(id);
    }

    public boolean deleteBook(int id) {
        return bookStore.remove(id) != null;
    }

    public boolean updateAvailability(int id, boolean available) {
        Book book = bookStore.get(id);
        if (book != null) {
            book.setAvailable(available);
            return true;
        }
        return false;
    }
}
