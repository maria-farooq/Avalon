package org.koaksoft.avalon.configuration;

import org.koaksoft.avalon.commons.UserInteractionType;

/**
 * @author mariafarooq
 *
 */
public class GameConfiguration implements Configuration {
	
	private UserInteractionType userInteractionType = UserInteractionType.CLI;

	public GameConfiguration(UserInteractionType userInteractionType) {
		super();
		this.userInteractionType = userInteractionType;
	}

	/* (non-Javadoc)
	 * @see org.koaksoft.avalon.configuration.Configuration#getUserInteractionType()
	 */
	public UserInteractionType getUserInteractionType() {
		return userInteractionType;
	}

	/* (non-Javadoc)
	 * @see org.koaksoft.avalon.configuration.Configuration#setUserInteractionType(org.koaksoft.avalon.configuration.UserInteractionType)
	 */
	public void setUserInteractionType(UserInteractionType userInteractionType) {
		this.userInteractionType = userInteractionType;
	}
}
