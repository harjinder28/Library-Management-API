package com.sts.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sts.entities.Author;
import com.sts.entities.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{
	public Book  findByBookId(int bookId);
	public List<Book> findAll();
	public List<Book> findByTitle(String title);
	public List<Book> findByAuthor(Author author);
	public Book findByISBN(String iSBN);
	public List<Book> findByCategory(String category);
	
	@Transactional
	public void deleteByBookId(int bookId);
}
