package com.sts.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.UniqueConstraint;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bookId;
	private String title;
	@OneToOne(cascade = CascadeType.ALL)
	private Author author;
	private String ISBN;
	private String edition;
	private String category;
	private String price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, String title, Author author, String iSBN, String edition, String category, String price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.ISBN = iSBN;
		this.edition = edition;
		this.category = category;
		this.price = price;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author=" + author + ", ISBN=" + ISBN + ", edition="
				+ edition + ", category=" + category + ", price=" + price + "]";
	}

	

}
