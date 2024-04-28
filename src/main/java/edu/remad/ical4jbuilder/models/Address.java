package edu.remad.ical4jbuilder.models;

public interface Address {

	/**
	 * Gets Id
	 *
	 * @return Adress's Id
	 */
	long getId();

	/**
	 * Gets street
	 *
	 * @return adress's street
	 */
	String getAddressStreet();

	/**
	 * Sets street
	 *
	 * @param addressStreet address's street to set
	 */
	void setAddressStreet(String addressStreet);

	/**
	 * Gets house number
	 *
	 * @return address's house number
	 */
	String getAddressHouseNo();

	/**
	 * Sets house number
	 *
	 * @param addressHouseNo address's house number
	 */
	void setAddressHouseNo(String addressHouseNo);

	ZipCode getAddressZipCode();

	void setAddressZipCode(ZipCode addressZipCode);

	int hashCode();

	boolean equals(Object obj);

	String toString();
}
