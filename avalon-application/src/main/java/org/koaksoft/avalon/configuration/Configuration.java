package org.koaksoft.avalon.configuration;

import org.koaksoft.avalon.commons.UserInteractionType;

public interface Configuration {

	/**
	 * @return
	 */
	UserInteractionType getUserInteractionType();
	
	/**
	 * @param userInteractionType
	 */
	void setUserInteractionType(UserInteractionType userInteractionType);

}
