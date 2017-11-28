package com.xjd.utils.my.web.respcode.impl;

import java.util.Locale;

import org.springframework.context.support.MessageSourceAccessor;

import com.xjd.utils.basic.annotation.Nullable;
import com.xjd.utils.my.web.respcode.MessageSource;

/**
 * @author elvis.xu
 * @since 2017-11-23 10:39
 */
public class SpringMessageSource implements MessageSource {
	private final String defaultMessage;
	protected SpringMessageSourceAccessor springMessageSourceAccessor;

	public SpringMessageSource(org.springframework.context.MessageSource messageSource, @Nullable String defaultMessage) {
		this.springMessageSourceAccessor = new SpringMessageSourceAccessor(messageSource);
		this.defaultMessage = defaultMessage;
	}

	public SpringMessageSource(org.springframework.context.MessageSource messageSource, @Nullable Locale defaultLocale, @Nullable String defaultMessage) {
		this.springMessageSourceAccessor = new SpringMessageSourceAccessor(messageSource, defaultLocale);
		this.defaultMessage = defaultMessage;
	}

	@Override
	public Locale getDefaultLocale() {
		return springMessageSourceAccessor.getDefaultLocale();
	}

	@Override
	public String getDefaultMessage() {
		return defaultMessage;
	}

	@Override
	public String getMessage(String code, Object[] args, String defaultMessage, Locale locale) {
		return springMessageSourceAccessor.getMessage(code, args, defaultMessage, locale);
	}

	public static class SpringMessageSourceAccessor extends MessageSourceAccessor {

		public SpringMessageSourceAccessor(org.springframework.context.MessageSource messageSource) {
			super(messageSource);
		}

		public SpringMessageSourceAccessor(org.springframework.context.MessageSource messageSource, Locale defaultLocale) {
			super(messageSource, defaultLocale);
		}

		@Override
		public Locale getDefaultLocale() {
			return super.getDefaultLocale();
		}
	}
}
