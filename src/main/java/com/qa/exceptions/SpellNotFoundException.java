package com.qa.exceptions;

import javax.persistence.EntityNotFoundException;

public class SpellNotFoundException extends EntityNotFoundException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SpellNotFoundException() {
		super();
	}

	public SpellNotFoundException(String message) {
		super(message);
	}

}
