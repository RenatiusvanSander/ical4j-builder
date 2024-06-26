package edu.remad.ical4jbuilder.models;

import edu.remad.ical4jbuilder.constants.InterchangeCalendarConstants;
import net.fortuna.ical4j.model.property.ProdId;

public class InterchangeCalendarProdId extends ProdId {

	/**
	 * serial version uid
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructor creates instance of {@link InterchangeCalendarProdId} with
	 * prefilled production id
	 */
	public InterchangeCalendarProdId() {
		super(InterchangeCalendarConstants.PRODUCTION_ID_KEY);
	}

	/**
	 * 
	 * @param poductionId production identifier to set
	 */
	public InterchangeCalendarProdId(String poductionId) {
		super(poductionId);
	}
}
