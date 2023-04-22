package com.arionmathias.bookstore.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.arionmathias.bookstore.dao.BookDAO;
import com.arionmathias.bookstore.model.Book;

@Service
public class BookService {
	
	@Autowired
	BookDAO bookDAO;

	public Page<Book> findByPageFiltered(Pageable pagination, Map<String, String> requestParams) {
		return this.bookDAO.listBooks(pagination, requestParams);
		
	}

	public Book create(Book book) {
		return bookDAO.createOne(book);
	}
	
	

}
