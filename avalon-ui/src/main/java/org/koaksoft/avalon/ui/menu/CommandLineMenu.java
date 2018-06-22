package org.koaksoft.avalon.ui.menu;

import java.util.Map;

import org.koaksoft.avalon.commons.Messages;
import org.koaksoft.avalon.io.IOManager;

public class CommandLineMenu<MenuItemType> extends BaseMenu<MenuItemType> {

	private final IOManager ioManager;

	public CommandLineMenu(String titleMessage, Map<Integer, MenuItemType> items, final IOManager ioManager) {
		super(titleMessage, items);
		this.ioManager = ioManager;
	}

	public MenuItemType show() {

		if (titleMessage != null)
			ioManager.write(this.titleMessage);

		if (items != null)
			items.forEach((index, item)->ioManager.write(String.format(Messages.GENERAL_MENU_ITEM_FORMAT, index, item.toString())));

		return items.get(ioManager.readInputAsInt());
	}
}
