package com.arionmathias.bookstore.dao;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.arionmathias.bookstore.dao.repository.BookRepository;
import com.arionmathias.bookstore.dao.specification.BookSpecification;
import com.arionmathias.bookstore.model.Book;

@Component
public class BookDAO {

	@Autowired
	private BookRepository bookRepo;

	public Page<Book> listBooks(Pageable pageable, Map<String, String> filters) {

		Specification<Book> specificationSearch = BookSpecification.orderByTitle();

		if (filters.containsKey("totalPages") && !filters.get("totalPages").isBlank()) {
			specificationSearch = specificationSearch
					.and(BookSpecification.filterByQuantityPages(filters.get("totalPages")));
		}

		if (filters.containsKey("search") && !filters.get("search").isBlank()) {

			String searchField = filters.get("search");
			Specification<Book> specificationTitleOrDescription = BookSpecification.filterByTitle(searchField)
					.or(BookSpecification.filterByDescription(searchField));

			specificationSearch = specificationSearch.and(specificationTitleOrDescription);
		}

		return this.bookRepo.findAll(specificationSearch, pageable);
	}

	@Transactional
	public void createMany(Book... books) {
		for (Book book : books) {
			this.bookRepo.save(book);
		}
	}

	@Transactional
	public Book createOne(Book book) {
		return this.bookRepo.save(book);
	}

}
