package com.sts.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.sts.Dao.AuthorRepository;
import com.sts.Dao.BookRepository;
import com.sts.entities.Book;
import com.sts.entities.Author;

@Service
public class BookService {
	@Autowired
	BookRepository bookRepository;
	@Autowired
	AuthorRepository authorRepository;

	public Book getBookById(int bookId) {
		return bookRepository.findByBookId(bookId);
	}

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}
	public List<Book> getBooksByTitle(String title) {
		return bookRepository.findByTitle(title);
	}
	public List<Book> getBooksByAuthor(String Author) {
		List<Author> authors=authorRepository.findByAuthorName(Author);
		List<Book>books=new ArrayList<>();
		authors.forEach((author) -> books.addAll((bookRepository.findByAuthor(author))));
		return books;
	}
	public List<Book> getBooksByCategory(String category) {
		return bookRepository.findByCategory(category);
	}
	
	public Book getBookByISBN(String ISBN) {
		return bookRepository.findByISBN(ISBN);
	}
	
	public Book addBook(Book book) {
		bookRepository.save(book);
		return book;
	}
	public Book updateBook(Book book) {
		bookRepository.save(book);
		return book;
	}
	public String deleteBookById(int bookId) {
		bookRepository.deleteByBookId(bookId);
		return "Book Deleted";
	}
	
}
