package com.af5m.elm.model;

import java.util.UUID;

/**
 * The Class Resource.
 */
public class Resource {

	private UUID uuid;
	private UUID bundleUuid;
	private UUID severityUuid;
	private String enumId;
	private String description;
	private boolean active;
	
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
	 * Gets the bundle uuid.
	 *
	 * @return the bundle uuid
	 */
	public UUID getBundleUuid() {
		return bundleUuid;
	}
	
	/**
	 * Sets the bundle uuid.
	 *
	 * @param bundleUuid the new bundle uuid
	 */
	public void setBundleUuid(UUID bundleUuid) {
		this.bundleUuid = bundleUuid;
	}
	
	/**
	 * Gets the severity uuid.
	 *
	 * @return the severity uuid
	 */
	public UUID getSeverityUuid() {
		return severityUuid;
	}
	
	/**
	 * Sets the severity uuid.
	 *
	 * @param severityUuid the new severity uuid
	 */
	public void setSeverityUuid(UUID severityUuid) {
		this.severityUuid = severityUuid;
	}
	
	/**
	 * Gets the enum id.
	 *
	 * @return the enum id
	 */
	public String getEnumId() {
		return enumId;
	}
	
	/**
	 * Sets the enum id.
	 *
	 * @param enumId the new enum id
	 */
	public void setEnumId(String enumId) {
		this.enumId = enumId;
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
	 * Checks if is active.
	 *
	 * @return true, if is active
	 */
	public boolean isActive() {
		return active;
	}
	
	/**
	 * Sets the active.
	 *
	 * @param active the new active
	 */
	public void setActive(boolean active) {
		this.active = active;
	}
	
}
