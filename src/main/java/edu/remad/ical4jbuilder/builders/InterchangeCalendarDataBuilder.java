package edu.remad.ical4jbuilder.builders;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import edu.remad.ical4jbuilder.models.InterchangeCalendarData;
import net.fortuna.ical4j.model.Parameter;
import net.fortuna.ical4j.model.property.ProdId;

public class InterchangeCalendarDataBuilder {

	private LocalDateTime endTime;
	private LocalDateTime startTime;
	private String appointmentName;
	private String location;
	private Map<String, List<Parameter>> attendees;
	private Map<String, List<Parameter>> organizers;
	private ProdId prodId;
	private String filePath;

	public InterchangeCalendarDataBuilder endTime(LocalDateTime endTime) {
		this.endTime = endTime;

		return this;
	}

	public InterchangeCalendarDataBuilder startTime(LocalDateTime startTime) {
		this.startTime = startTime;

		return this;
	}

	public InterchangeCalendarDataBuilder appointmentName(String appointmentName) {
		this.appointmentName = appointmentName;
		return this;
	}

	public InterchangeCalendarDataBuilder location(String location) {
		this.location = location;

		return this;
	}

	public InterchangeCalendarDataBuilder attendees(Map<String, List<Parameter>> attendees) {
		this.attendees = attendees;
		return this;
	}

	public InterchangeCalendarDataBuilder organizers(Map<String, List<Parameter>> organizers) {
		this.organizers = organizers;
		return this;
	}

	public InterchangeCalendarDataBuilder prodId(ProdId prodId) {
		this.prodId = prodId;
		return this;
	}

	public InterchangeCalendarDataBuilder filePath(String filePath) {
		this.filePath = filePath;
		return this;
	}

	public InterchangeCalendarData build() {
		return new InterchangeCalendarData(endTime, startTime, appointmentName, location, attendees, organizers, prodId,
				filePath);
	}
}
