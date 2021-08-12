package com.bookstore.exceptions;

public class ResourceNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1549512550748815404L;

	public ResourceNotFoundException(String message) {
		super(message);
	}
}
