package com.sts.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sts.entities.Author;
import java.util.List;


@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer>{
	public List<Author> findAll();
	public Author findByAuthorId(int authorId);
	public List<Author> findByAuthorName(String authorName);
}
