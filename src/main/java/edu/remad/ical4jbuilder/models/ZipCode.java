package edu.remad.ical4jbuilder.models;

import java.time.LocalDateTime;

public interface ZipCode {

	String getZipCode();

	void setZipCode(String zipCode);

	/**
	 * Gets location
	 *
	 * @return zipcode's location
	 */
	String getZipCodeLocation();

	/**
	 * Sets location
	 *
	 * @param zipCodeLocation zipcode's location to set
	 */
	void setZipCodeLocation(String zipCodeLocation);

	/**
	 * Gets zipcode
	 *
	 * @return zipcode
	 */
	long getId();

	/**
	 * Sets zip code
	 *
	 * @param id zip code to set
	 */
	void setId(long id);

	/**
	 * Gets creation date
	 *
	 * @return zipcode's creation date
	 */
	LocalDateTime getZipCodeCreationDate();

	/**
	 * Sets creation date
	 *
	 * @param zipCodeCreationDate zipcode's creation date to set
	 */
	void setZipCodeCreationDate(LocalDateTime zipCodeCreationDate);

	int hashCode();

	boolean equals(Object obj);

	String toString();
}
