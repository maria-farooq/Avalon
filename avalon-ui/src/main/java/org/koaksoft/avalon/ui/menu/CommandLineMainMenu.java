package org.koaksoft.avalon.ui.menu;

import java.util.Map;

import org.koaksoft.avalon.io.IOManager;

public class CommandLineMainMenu extends CommandLineMenu<MainMenuItem> {

	public CommandLineMainMenu(String titleMessage, Map<Integer, MainMenuItem> items, IOManager ioManager) {
		super(titleMessage, items, ioManager);
	}

}
