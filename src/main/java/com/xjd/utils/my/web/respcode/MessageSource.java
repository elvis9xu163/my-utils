package com.xjd.utils.my.web.respcode;

import java.util.Locale;

/**
 * @author elvis.xu
 * @since 2017-11-23 10:29
 */
public interface MessageSource {

	/**
	 * Return the default locale to use if no explicit locale has been given.
	 * @return
	 */
	Locale getDefaultLocale();

	/**
	 * Return the default message to use if no message found for the code.
	 * @return
	 */
	String getDefaultMessage();

	/**
	 * Retrieve the message for the given code and the given Locale.
	 * @param code code of the message
	 * @param args arguments for the message, or {@code null} if none
	 * @param defaultMessage String to return if the lookup fails
	 * @param locale Locale in which to do lookup
	 * @return the message
	 */
	String getMessage(String code, Object[] args, String defaultMessage, Locale locale);

	/**
	 * Retrieve the message for the given code and the default Locale.
	 * @param code code of the message
	 * @param defaultMessage String to return if the lookup fails
	 * @return the message
	 */
	default String getMessage(String code, String defaultMessage) {
		return getMessage(code, null, defaultMessage, getDefaultLocale());
	}

	/**
	 * Retrieve the message for the given code and the given Locale.
	 * @param code code of the message
	 * @param defaultMessage String to return if the lookup fails
	 * @param locale Locale in which to do lookup
	 * @return the message
	 */
	default String getMessage(String code, String defaultMessage, Locale locale) {
		return getMessage(code, null, defaultMessage, locale);
	}

	/**
	 * Retrieve the message for the given code and the default Locale.
	 * @param code code of the message
	 * @param args arguments for the message, or {@code null} if none
	 * @param defaultMessage String to return if the lookup fails
	 * @return the message
	 */
	default String getMessage(String code, Object[] args, String defaultMessage) {
		return getMessage(code, args, defaultMessage, getDefaultLocale());
	}

	/**
	 * Retrieve the message for the given code and the default Locale.
	 * @param code code of the message
	 * @return the message
	 */
	default String getMessage(String code) {
		return getMessage(code, null, getDefaultMessage(), getDefaultLocale());
	}

	/**
	 * Retrieve the message for the given code and the given Locale.
	 * @param code code of the message
	 * @param locale Locale in which to do lookup
	 * @return the message
	 */
	default String getMessage(String code, Locale locale) {
		return getMessage(code, null, getDefaultMessage(), locale);
	}

	/**
	 * Retrieve the message for the given code and the default Locale.
	 * @param code code of the message
	 * @param args arguments for the message, or {@code null} if none
	 * @return the message
	 */
	default String getMessage(String code, Object[] args) {
		return getMessage(code, args, getDefaultMessage(), getDefaultLocale());
	}

	/**
	 * Retrieve the message for the given code and the given Locale.
	 * @param code code of the message
	 * @param args arguments for the message, or {@code null} if none
	 * @param locale Locale in which to do lookup
	 * @return the message
	 */
	default String getMessage(String code, Object[] args, Locale locale) {
		return getMessage(code, args, getDefaultMessage(), locale);
	}
}
