package com.af5m.elm.model;

import java.util.UUID;

/**
 * The Class LocalizedResourceElement.
 */
public class LocalizedResourceElement{
	private UUID uuid;
	private Message parentMessage;
	private Locale locale;
	private String messageText;
	private MessageElementType MessageElementType;
	
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
	 * Gets the parent message.
	 *
	 * @return the parent message
	 */
	public Message getParentMessage() {
		return parentMessage;
	}
	
	/**
	 * Sets the parent message.
	 *
	 * @param parentMessage the new parent message
	 */
	public void setParentMessage(Message parentMessage) {
		this.parentMessage = parentMessage;
	}
	
	/**
	 * Gets the locale.
	 *
	 * @return the locale
	 */
	public Locale getLocale() {
		return locale;
	}
	
	/**
	 * Sets the locale.
	 *
	 * @param locale the new locale
	 */
	public void setLocale(Locale locale) {
		this.locale = locale;
	}
	
	/**
	 * Gets the message text.
	 *
	 * @return the message text
	 */
	public String getMessageText() {
		return messageText;
	}
	
	/**
	 * Sets the message text.
	 *
	 * @param messageText the new message text
	 */
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	
	/**
	 * Gets the message element type.
	 *
	 * @return the message element type
	 */
	public MessageElementType getMessageElementType() {
		return MessageElementType;
	}
	
	/**
	 * Sets the message element type.
	 *
	 * @param messageElementType the new message element type
	 */
	public void setMessageElementType(MessageElementType messageElementType) {
		MessageElementType = messageElementType;
	}
}
