package com.xjd.utils.my.web.respcode.impl;

import java.util.Locale;

import org.springframework.context.support.MessageSourceAccessor;

import com.xjd.utils.basic.annotation.Nullable;
import com.xjd.utils.my.web.respcode.MessageSource;

/**
 * @author elvis.xu
 * @since 2017-11-23 10:39
 */
public class SpringMessageSource extends MessageSourceAccessor implements MessageSource {
	private final String defaultMessage;

	public SpringMessageSource(org.springframework.context.MessageSource messageSource, @Nullable String defaultMessage) {
		super(messageSource);
		this.defaultMessage = defaultMessage;
	}

	public SpringMessageSource(org.springframework.context.MessageSource messageSource, @Nullable Locale defaultLocale, @Nullable String defaultMessage) {
		super(messageSource, defaultLocale);
		this.defaultMessage = defaultMessage;
	}

	@Override
	public Locale getDefaultLocale() {
		return super.getDefaultLocale();
	}

	@Override
	public String getDefaultMessage() {
		return defaultMessage;
	}

	@Override
	public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
		return super.getMessage(code, args, defaultMessage, locale);
	}
}
