package org.koaksoft.avalon.ui.menu;

public enum MainMenuItem {

	/**
	 * option to start a new game.
	 */
	START ("Start a new game"),

	/**
	 * option to load a saved game.
	 */
	RELOAD ("Open an existing one"),

	/**
	 * exit the game
	 */
	EXIT ("Exit");

	private final String label;
	
	private MainMenuItem(final String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

    @Override
    public String toString() {
        return label;
    }
}
