package com.af5m.elm.model;

import java.util.UUID;

/**
 * The Class Source.
 */
public class Source {
	private UUID uuid;
	private String name;
	private String sourceType;
	private UUID organizationUuid;
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
	 * Gets the source type.
	 *
	 * @return the source type
	 */
	public String getSourceType() {
		return sourceType;
	}
	
	/**
	 * Sets the source type.
	 *
	 * @param sourceType the new source type
	 */
	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	
	/**
	 * Gets the organization uuid.
	 *
	 * @return the organization uuid
	 */
	public UUID getOrganizationUuid() {
		return organizationUuid;
	}
	
	/**
	 * Sets the organization uuid.
	 *
	 * @param organizationUuid the new organization uuid
	 */
	public void setOrganizationUuid(UUID organizationUuid) {
		this.organizationUuid = organizationUuid;
	}
}
