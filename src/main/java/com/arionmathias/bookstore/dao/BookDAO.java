package com.arionmathias.bookstore.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.arionmathias.bookstore.model.Book;

import jakarta.persistence.EntityManager;

@Component
public class BookDAO {
	
	@Autowired
	private EntityManager entityManager;
	
	
	@Transactional
	public void createMany(Book... books) {
		for(Book book: books) {
			this.entityManager.persist(book);
		}
	}
	
	@Transactional
	public Book createOne(Book book) {
		return this.entityManager.merge(book);
	}
}
