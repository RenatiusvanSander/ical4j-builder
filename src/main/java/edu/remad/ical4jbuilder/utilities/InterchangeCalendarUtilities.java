package edu.remad.ical4jbuilder.utilities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import static net.fortuna.ical4j.model.Parameter.*;

import edu.remad.ical4jbuilder.constants.InterchangeCalendarConstants;
import edu.remad.ical4jbuilder.exceptions.InterChangeCalendarUtilitiesException;
import edu.remad.ical4jbuilder.models.InterchangeCalendarProdId;
import net.fortuna.ical4j.model.Parameter;
import net.fortuna.ical4j.model.parameter.Cn;
import net.fortuna.ical4j.model.parameter.Email;
import net.fortuna.ical4j.model.parameter.Role;
import net.fortuna.ical4j.model.property.Uid;

public class InterchangeCalendarUtilities {
	
	/**
	 * private Constructor not to instantiate
	 */
	private InterchangeCalendarUtilities() {
	}
	
	public static Uid generateUid() {
		return InterchangeCalendarConstants.UID_GENERATOR.generateUid();
	}
	
	public static InterchangeCalendarProdId createInterchangeCalendarProdId() {
		return new InterchangeCalendarProdId();
	}
	
	public static Map<String, List<Parameter>> createOrganizerMap(Map<String,String> organizerData) {
		if(organizerData.isEmpty()) {
			throw new InterChangeCalendarUtilitiesException("organizer data has to be populated.");
		}
		
		List<Parameter> parameters = createParameterList(organizerData, Role.CHAIR);
		Map<String, List<Parameter>> organizer = new HashMap<>();
		organizer.put(InterchangeCalendarConstants.MAILTO_KEY + organizerData.get(EMAIL), parameters);
		
		return organizer;
	}

	private static List<Parameter> createParameterList(Map<String, String> organizerData, Role role) {
		if(organizerData == null || organizerData.isEmpty() || role == null) {
			
			String errorMessage = StringUtils.EMPTY;
			if(organizerData == null) {
				errorMessage = "organizerData is null!";
			} else if(organizerData.isEmpty()) {
				errorMessage = "organizerData shall not be empty!";
			} else if(role == null) {
				errorMessage = "Role shalls not be null!";
			} else {
				errorMessage = "Please check usage of createParameterList(Map<String, String>, Role) !";
			}
			
			throw new InterChangeCalendarUtilitiesException(errorMessage);
		}
		
		List<Parameter> parameters = new ArrayList<>();
		
		for (Map.Entry<String, String> entry : organizerData.entrySet()) {
			switch(entry.getKey()) {
			case EMAIL : {
				parameters.add(new Email(entry.getValue()));
				break;
			}
			case CN: {
				parameters.add(new Cn(entry.getValue()));
				break;
			}
			}
		}
		parameters.add(role);
		
		return parameters;
	}
	
	public static Map<String, List<Parameter>> createAttendeeMap(Map<String,String> attendeeData) {
		if(attendeeData.isEmpty()) {
			throw new InterChangeCalendarUtilitiesException("attendee data has to be populated.");
		}
		
		List<Parameter> parameters = createParameterList(attendeeData, Role.REQ_PARTICIPANT);
		Map<String, List<Parameter>> attendee = new HashMap<>();
		attendee.put(InterchangeCalendarConstants.MAILTO_KEY + attendeeData.get(EMAIL), parameters);
		
		return attendee;
	}
}