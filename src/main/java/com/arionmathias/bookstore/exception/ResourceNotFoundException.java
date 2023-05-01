package com.arionmathias.bookstore.exception;

public class ResourceNotFoundException extends BookstoreException{

	private static final long serialVersionUID = -5608318407813723063L;

	public ResourceNotFoundException(String entityName, String id) {
		super("Could not find "+entityName+" with id equals "+id);
	}
}
