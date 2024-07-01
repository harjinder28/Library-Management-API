package com.sts.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.Dao.AuthorRepository;
import com.sts.entities.Author;

@Service
public class AuthorService {
@Autowired
AuthorRepository authorRepository;

public Author addAuthor(Author author) {
	authorRepository.save(author);
	return author;
}
public Author getAuthorById(int authorId) {
	return authorRepository.findByAuthorId(authorId);
}
public  List<Author> getAllAuthors() {
	return authorRepository.findAll();
}
	public  List<Author> getAuthorsByAuthorName(String authorName) {
		return authorRepository.findByAuthorName(authorName);
}

}
