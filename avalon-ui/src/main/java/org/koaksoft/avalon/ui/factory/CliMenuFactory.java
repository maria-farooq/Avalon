package org.koaksoft.avalon.ui.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import org.koaksoft.avalon.commons.Messages;
import org.koaksoft.avalon.input.BaseInputReader;
import org.koaksoft.avalon.io.IOManager;
import org.koaksoft.avalon.out.BaseOutputWriter;
import org.koaksoft.avalon.ui.menu.MainMenu;
import org.koaksoft.avalon.ui.menu.MainMenuItem;
import org.koaksoft.avalon.ui.menu.Menu;

public class CliMenuFactory implements MenuFactory {

	@Override
	public Menu provideMainMenu() {
		Map<Integer, MainMenuItem> items = new HashMap<Integer, MainMenuItem>();
		MainMenuItem[] values = MainMenuItem.values();
		int noOfItems = values.length;

		for (int i = 1; i <= noOfItems; i++)
			items.put(i, values[i-1]);
		return new MainMenu(Messages.MAIN_MENU_TITLE, items, );
	}

}
