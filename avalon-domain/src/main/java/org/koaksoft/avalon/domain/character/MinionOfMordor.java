package org.koaksoft.avalon.domain.character;

/**
 * Allies of evil Mordor, fighting to spread unrest and darkness in island
 * of Avalon.
 * 
 * @author mariafarooq
 *
 */
public class MinionOfMordor extends BaseCharacter{

	public MinionOfMordor(Control mode, Integer lives, Integer physicalStrength) {
		super(Role.EVIL_MORDOR, mode, lives, physicalStrength);
	}

}
