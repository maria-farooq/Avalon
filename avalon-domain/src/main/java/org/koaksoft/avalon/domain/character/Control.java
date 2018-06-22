package org.koaksoft.avalon.domain.character;

/**
 * In Avalon one is free to choose its character, hence all characters in game
 * are open to be picked by player. Rest of the players would automatically go
 * in Nonplayer Character mode.
 * 
 * @author mariafarooq
 *
 */
public enum Control {

	/**
	 * Active player, In charge of the game control and goes on quest and
	 * explorations.
	 */
	PLAYER,

	/**
	 * Character that are not controlled by a player aka non player character,
	 * who are activated only when a player reaches there territory and
	 * interacts with them.
	 */
	NON_PLAYER
}
