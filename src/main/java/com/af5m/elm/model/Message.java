package com.af5m.elm.model;

import java.util.List;
import java.util.UUID;

/**
 * The Class Message.
 */
public class Message {
	
	private UUID uuid;
	private Source source;
	private MessageType messageType;
	private Severity severity;
	private List<LocalizedMessageElement> localizedMessageElements;
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
	 * Gets the source.
	 *
	 * @return the source
	 */
	public Source getSource() {
		return source;
	}
	
	/**
	 * Sets the source.
	 *
	 * @param source the new source
	 */
	public void setSource(Source source) {
		this.source = source;
	}
	
	/**
	 * Gets the message type.
	 *
	 * @return the message type
	 */
	public MessageType getMessageType() {
		return messageType;
	}
	
	/**
	 * Sets the message type.
	 *
	 * @param messageType the new message type
	 */
	public void setMessageType(MessageType messageType) {
		this.messageType = messageType;
	}
	
	/**
	 * Gets the severity.
	 *
	 * @return the severity
	 */
	public Severity getSeverity() {
		return severity;
	}
	
	/**
	 * Sets the severity.
	 *
	 * @param severity the new severity
	 */
	public void setSeverity(Severity severity) {
		this.severity = severity;
	}
	
	/**
	 * Gets the localized messages.
	 *
	 * @return the localized messages
	 */
	public List<LocalizedMessageElement> getLocalizedMessageElements() {
		return localizedMessageElements;
	}
	
	/**
	 * Sets the localized messages.
	 *
	 * @param localizedMessages the new localized messages
	 */
	public void setLocalizedMessageElements(List<LocalizedMessageElement> localizedMessageElements) {
		this.localizedMessageElements = localizedMessageElements;
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
