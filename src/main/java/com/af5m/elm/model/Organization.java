package com.af5m.elm.model;

import java.util.UUID;

/**
 * The Class Organization.
 */
public class Organization {
	private UUID uuid;
	private String name;
	private String description;
	private boolean isPrivate;
	
	/**
	 * Gets the uuid.
	 *
	 * @return the uuid
	 */
	public UUID getUuid() {
		return uuid;
	}
	
	/**
	 * Sets the uuid.
	 *
	 * @param uuid the new uuid
	 */
	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
	
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
	 * Gets the description.
	 *
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	
	/**
	 * Sets the description.
	 *
	 * @param description the new description
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	/**
	 * Checks if is private.
	 *
	 * @return true, if is private
	 */
	public boolean isPrivate() {
		return isPrivate;
	}
	
	/**
	 * Sets the private.
	 *
	 * @param isPrivate the new private
	 */
	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}
}
