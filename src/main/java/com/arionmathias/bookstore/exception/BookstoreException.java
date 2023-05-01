package com.arionmathias.bookstore.exception;

public class BookstoreException extends RuntimeException {

	private static final long serialVersionUID = 843192768517383275L;
	
	public BookstoreException(String msg) {
		super(msg);
	}
}
