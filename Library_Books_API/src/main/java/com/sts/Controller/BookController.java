package com.sts.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.Dao.BookRepository;
import com.sts.Service.BookService;
import com.sts.entities.Book;

@RestController
public class BookController {
	@Autowired
	BookService bookService;

	@GetMapping("/books")
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}

	@GetMapping("/books/author/{authorName}")
	public List<Book> getBooksByAuthor(@PathVariable  String authorName) {
		return bookService.getBooksByAuthor(authorName);
	}

	@GetMapping("/books/category/{category}")
	public List<Book> getBooksByCategory(@PathVariable String category) {
		return bookService.getBooksByCategory(category);
	}

	@GetMapping("/books/title/{title}")
	public List<Book> getBooksByTitle(@PathVariable String title) {
		return bookService.getBooksByTitle(title);
	}

	@GetMapping("/books/{id}")
	public Book getBooksById(@PathVariable int id) {
		Book book = bookService.getBookById(id);
		return book;
	}

	@GetMapping("/books/isbn/{ISBN}")
	public Book getBooksByISBN(@PathVariable String ISBN) {
		Book book = bookService.getBookByISBN(ISBN);
		return book;
	}

	@PostMapping("/books")
	public Book addBook(@RequestBody Book book) {
		return bookService.addBook(book);
	}

	@PutMapping("/books")
	public Book updateBook(@RequestBody Book book) {
		return bookService.updateBook(book);
	}

	@DeleteMapping("/books/{bookId}")
	public String deleteBook(@PathVariable int bookId) {
		return bookService.deleteBookById(bookId);
	}

}
