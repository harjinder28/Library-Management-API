package com.sts.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.Service.AuthorService;
import com.sts.entities.Author;

@RestController
public class AuthorController {

	@Autowired
	AuthorService authorService;
	
	@GetMapping("/author")
	public List<Author> getAllAuthor() {
		return authorService.getAllAuthors();
	}
	@GetMapping("/author/id/{authorId}")
	public Author getAuthorById(@PathVariable int authorId) {
		return authorService.getAuthorById(authorId);
	}
	@GetMapping("/author/name/{authorName}")
	public List<Author> getAuthorById(@PathVariable String authorName) {
		return authorService.getAuthorsByAuthorName(authorName);
	}
	@PostMapping("/author")
	public Author addAuthor(@RequestBody Author author) {
		return authorService.addAuthor(author);
	}
}
