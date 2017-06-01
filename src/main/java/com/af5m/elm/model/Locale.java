package com.af5m.elm.model;

import java.util.UUID;

import javax.persistence.Column;

/**
 * The Class Locale.
 */
public class Locale {

	@Column(name="name")
	private String name;
	
	@Column(name="visable")
	private boolean isVisable;
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Checks if is visable.
	 *
	 * @return true, if is visable
	 */
	public boolean isVisable() {
		return isVisable;
	}
	
	/**
	 * Sets the visable.
	 *
	 * @param isVisable the new visable
	 */
	public void setVisable(boolean isVisable) {
		this.isVisable = isVisable;
	}

}
