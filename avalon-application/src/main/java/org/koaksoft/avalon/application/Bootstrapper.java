package org.koaksoft.avalon.application;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.koaksoft.avalon.commons.Messages;
import org.koaksoft.avalon.commons.UserInteractionType;
import org.koaksoft.avalon.configuration.Configuration;
import org.koaksoft.avalon.configuration.ConfigurationBuilder;
import org.koaksoft.avalon.configuration.DefaultConfigurationBuilder;
import org.koaksoft.avalon.context.Context;
import org.koaksoft.avalon.exception.ConfigurationException;
import org.koaksoft.avalon.io.factory.IOFactory;
import org.koaksoft.avalon.ui.factory.CliMenuFactory;
import org.koaksoft.avalon.ui.factory.MenuFactory;
import org.koaksoft.avalon.ui.menu.MainMenuItem;
import org.koaksoft.avalon.ui.menu.Menu;

/**
 * @author mariafarooq
 *
 */
public class Bootstrapper {

    private static final Logger LOGGER = LogManager.getLogger(Bootstrapper.class);

    private Configuration configuration;
    private MenuFactory menuFactory;
    private IOFactory ioFactory;

    public Bootstrapper (final Context context) {
    	try {
			configuration = initConfiguration(context);
			menuFactory = getMenuFactory(context);
			ioFactory = getIOFactory(context);
		} catch (ConfigurationException e) {
			destroy(e, "Failed to bootstrap the game.");
		}
    }
    
	/**
	 * start the game sequence
	 * @throws ConfigurationException 
	 */
	public void init () {
		try {
			final Menu<MainMenuItem> mainMenu = menuFactory.provideMainMenu();
			MainMenuItem input = mainMenu.show();

			switch (input) {
			case START:
				
				break;
			case RELOAD:
				
				break;
			case EXIT:
				ioFactory.provideIOManager().write(Messages.EXIT);
				break;

			default:
				break;
			}
		} catch (Exception e) {
			destroy(e, "Failed to bootstrap the game.");
		}
		
	}

	/**
	 * 
	 */
	public void destroy (final Throwable cause, final String message) {
		LOGGER.error(message, cause);
        System.exit(1);
	}

	/**
	 * @param context
	 * @throws ConfigurationException
	 */
	private Configuration initConfiguration (final Context context) throws ConfigurationException {
		ConfigurationBuilder builder = new DefaultConfigurationBuilder();
		Configuration configuration = builder.getConfiguration();

		context.setAttribute(Configuration.class.getName(), configuration);
		return configuration;
	}

	/**
	 * @param context
	 */
	private MenuFactory getMenuFactory (final Context context) {
		Configuration configuration = (Configuration) context.getAttribute(Configuration.class.getName());
		UserInteractionType interactionType = configuration.getUserInteractionType();
		MenuFactory menuFactory;
		switch (interactionType) {
		case CLI:
			menuFactory = new CliMenuFactory();
			break;
		default:
			menuFactory = new CliMenuFactory();
			break;
		}
		return menuFactory;
	}

	/**
	 * @param context
	 */
	private IOFactory getIOFactory (final Context context) {
		Configuration configuration = (Configuration) context.getAttribute(Configuration.class.getName());
		UserInteractionType interactionType = configuration.getUserInteractionType();
		IOFactory ioFactory;
		switch (interactionType) {
		case CLI:
			menuFactory = new CliMenuFactory();
			break;
		default:
			menuFactory = new CliMenuFactory();
			break;
		}
		return menuFactory;
	}
}
