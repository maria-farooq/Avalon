package org.koaksoft.avalon.domain.character;

/**
 * @author mariafarooq
 *
 */
public class BaseCharacter implements Character {

	protected Role role;
	protected Control control;
	protected Integer lives;
	protected Integer physicalStrength;
	protected Location location;

	public BaseCharacter(Role role, Control control, Integer lives, Integer physicalStrength) {
		super();
		this.role = role;
		this.control = control;
		this.lives = lives;
		this.physicalStrength = physicalStrength;
	}

	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Control getControl() {
		return control;
	}
	public void setControl(Control control) {
		this.control = control;
	}
	public Integer getLives() {
		return lives;
	}
	public void setLives(Integer lives) {
		this.lives = lives;
	}
	public Integer getPhysicalStrength() {
		return physicalStrength;
	}
	public void setPhysicalStrength(Integer physicalStrength) {
		this.physicalStrength = physicalStrength;
	}

	
}
