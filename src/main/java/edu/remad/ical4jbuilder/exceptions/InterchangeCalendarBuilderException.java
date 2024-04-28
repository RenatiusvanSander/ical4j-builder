package edu.remad.ical4jbuilder.exceptions;

import edu.remad.ical4jbuilder.builders.InterchangeCalendarBuilder;

public class InterchangeCalendarBuilderException extends RuntimeException {

	/**
	 * generated serial UID
	 */
	private static final long serialVersionUID = 3961562043013239827L;

	public InterchangeCalendarBuilderException() {
		super(InterchangeCalendarBuilder.class.getName() + " has errors");
	}

	public InterchangeCalendarBuilderException(String errorMessage, Throwable throwable) {
		super(errorMessage, throwable);
	}
}
