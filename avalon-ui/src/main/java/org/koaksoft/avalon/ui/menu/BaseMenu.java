package org.koaksoft.avalon.ui.menu;

import java.util.Map;

public abstract class BaseMenu<MenuItemType> implements Menu<MenuItemType> {

	protected final String titleMessage;
	protected final Map<Integer, MenuItemType> items;

	public BaseMenu(String titleMessage, Map<Integer, MenuItemType> items) {
		super();
		this.titleMessage = titleMessage;
		this.items = items;
	}

	public String getTitleMessage() {
		return titleMessage;
	}

	public Map<Integer, MenuItemType> getItems() {
		return items;
	}

	public void addItem (MenuItemType item) {
		if(items.size() == 0)
			items.put(0, item);
		items.put(items.size()+1, item);
	}
}
