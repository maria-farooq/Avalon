package org.koaksoft.avalon.configuration;

import org.koaksoft.avalon.commons.UserInteractionType;
import org.koaksoft.avalon.exception.ConfigurationException;

public class DefaultConfigurationBuilder implements ConfigurationBuilder {

	public Configuration getConfiguration() throws ConfigurationException {
		return new GameConfiguration(UserInteractionType.CLI);
	}

}
