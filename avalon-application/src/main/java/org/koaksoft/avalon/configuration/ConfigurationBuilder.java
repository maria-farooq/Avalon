package org.koaksoft.avalon.configuration;

import org.koaksoft.avalon.exception.ConfigurationException;

public interface ConfigurationBuilder {

	Configuration getConfiguration() throws ConfigurationException;
}
