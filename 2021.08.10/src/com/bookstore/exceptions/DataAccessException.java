package com.bookstore.exceptions;

public class DataAccessException extends RuntimeException {
	private static final long serialVersionUID = -5472994743754631170L;

	public DataAccessException(String message) {
		super(message);
	}
}
