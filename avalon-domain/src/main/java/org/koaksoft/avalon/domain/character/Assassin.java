package org.koaksoft.avalon.domain.character;

/**
 * Assassin is a special MinionOfMordor with power to kill Merlin and win the game.
 * There is only one Assassin in Avalon.
 * 
 * @author mariafarooq
 *
 */
public class Assassin extends MinionOfMordor {

	private static Assassin instance = null;
	
	public static Assassin getInstance (Control mode, Integer lives, Integer physicalStrength) {
		if (instance == null) {
			return new Assassin(mode, lives, physicalStrength);
		}
		return instance;
	}

	private Assassin(Control mode, Integer lives, Integer physicalStrength) {
		super(mode, lives, physicalStrength);
	}

}
