package org.koaksoft.avalon.ui.factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.koaksoft.avalon.ui.menu.CommandLineMainMenu;

public class CliMenuFactoryTest {

	@Test
	public void provideMainMenu() {
		CliMenuFactory factory = new CliMenuFactory();
		CommandLineMainMenu menu = (CommandLineMainMenu) factory.provideMainMenu();
		assertEquals(3, menu.getItems().size());
	}

}
