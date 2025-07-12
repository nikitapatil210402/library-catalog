package com.library.catalog.controller;

import com.library.catalog.model.Book;
import com.library.catalog.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookService service;

    public BookController(BookService service) {
        this.service = service;
    }

    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return service.addBook(book);
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id) {
        return service.getBookById(id);
    }

    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable int id) {
        return service.deleteBook(id) ? "Deleted" : "Book not found";
    }

    @PutMapping("/{id}/availability")
    public String updateAvailability(@PathVariable int id, @RequestParam boolean available) {
        return service.updateAvailability(id, available) ? "Updated" : "Book not found";
    }
    
    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseBody
    public String handleValidationError(IllegalArgumentException ex) {
        return "Validation Error: " + ex.getMessage();
    }

}
