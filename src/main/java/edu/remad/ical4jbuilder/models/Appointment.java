package edu.remad.ical4jbuilder.models;

import java.time.LocalDateTime;

public interface Appointment {

	/**
	 * Gets tutoring appointment's number.
	 *
	 * @return tutoring appointment's number
	 */
	long getTutoringAppointmentNo();

	/**
	 * Sets tutoring appointment's number
	 *
	 * @param tutoringAppointmentNo tutoring appointment's number to set
	 */
	void setTutoringAppointmentNo(long tutoringAppointmentNo);

	/**
	 * Gets user.
	 *
	 * @return tutoring appointment's user
	 */
	User getTutoringAppointmentUser();

	/**
	 * Sets user
	 *
	 * @param tutoringAppointmentUser tutoring appointment's user to set
	 */
	void setTutoringAppointmentUser(User tutoringAppointmentUser);

	/**
	 * Gets date of appointment
	 *
	 * @return tutoring appointment's date
	 */
	LocalDateTime getTutoringAppointmentDate();

	/**
	 * Sets appointment date
	 *
	 * @param tutoringAppointmentDate tutoring appointment's date to set
	 */
	void setTutoringAppointmentDate(LocalDateTime tutoringAppointmentDate);

	/**
	 * Gets appointment start date time
	 *
	 * @return tutoring appointment's date time
	 */
	LocalDateTime getTutoringAppointmentStartDateTime();

	/**
	 * Sets appointment start date time
	 *
	 * @param tutoringAppointmentDateTime tutoring appointment's start date time to
	 *                                    set
	 */
	void setTutoringAppointmentStartDateTime(LocalDateTime tutoringAppointmentDateTime);

	/**
	 * @return tutoringAppointmentDateTime tutoring appointment's end date time
	 */
	LocalDateTime getTutoringAppointmentEndDateTime();

	/**
	 * Sets appointment end date time
	 * 
	 * @param tutoringAppointmentEndDateTime tutoringAppointmentDateTime tutoring
	 *                                       appointment's end date time
	 */
	void setTutoringAppointmentEndDateTime(LocalDateTime tutoringAppointmentEndDateTime);

	/**
	 * Gets creation date
	 *
	 * @return tutoring appointment's creation date
	 */
	LocalDateTime getTutoringAppointmentCreationDate();

	/**
	 * Sets creation date
	 *
	 * @param tutoringAppointmentCreationDate tutoring appointment's creation date
	 *                                        to set
	 */
	public void setTutoringAppointmentCreationDate(LocalDateTime tutoringAppointmentCreationDate);

	public int hashCode();

	boolean equals(Object obj);

	String toString();
}
