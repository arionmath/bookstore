package com.arionmathias.bookstore.dao.specification;

import org.springframework.data.jpa.domain.Specification;

import com.arionmathias.bookstore.model.Book;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class BookSpecification {

	public static Specification<Book> orderByTitle() {
		return new Specification<Book>() {
			private static final long serialVersionUID = -8780239054996609546L;

			@Override
			public Predicate toPredicate(Root<Book> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				query.orderBy(criteriaBuilder.asc(root.get("title")));
				return query.getRestriction();
			}

		};
	}

	public static Specification<Book> filterByTitle(String title) {

		return new Specification<Book>() {
			private static final long serialVersionUID = 7712916930444878390L;

			@Override
			public Predicate toPredicate(Root<Book> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				return criteriaBuilder.like(criteriaBuilder.upper(root.get("title")), "%" + title.toUpperCase() + "%");
			}
		};

	}

	public static Specification<Book> filterByDescription(String desc) {

		return new Specification<Book>() {
			private static final long serialVersionUID = 5787911233293319889L;

			@Override
			public Predicate toPredicate(Root<Book> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				return criteriaBuilder.like(criteriaBuilder.upper(root.get("description")),
						"%" + desc.toUpperCase() + "%");
			}
		};

	}
	
	public static Specification<Book> filterByQuantityPages(String pageQty) {

		return new Specification<Book>() {
			private static final long serialVersionUID = 987911233293319889L;
			@Override
			public Predicate toPredicate(Root<Book> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
				return criteriaBuilder.equal(root.get("totalPages"),Integer.parseInt(pageQty));
			}
		};

	}

}
