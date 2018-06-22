package org.koaksoft.avalon.ui.menu;

import java.util.Map;

public interface Menu<MenuItemType> {

	Map<Integer, MenuItemType> getItems();
	void addItem (MenuItemType item);
	MenuItemType show ();
	
}
