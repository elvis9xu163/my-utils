package com.xjd.utils.my.web.respcode;

/**
 * @author elvis.xu
 * @since 2017-11-23 10:55
 */
public abstract class RespViews {
	protected static MessageSource messageSource;

	public static MessageSource getMessageSource() {
		return messageSource;
	}

	public static void setMessageSource(MessageSource messageSource) {
		RespViews.messageSource = messageSource;
	}

	public static RespView respView() {
		return respView(RespCode.RC_0000, null, null, null);
	}

	public static RespView respView(String code) {
		return respView(code, null, null, null);
	}

	public static RespView respView(String code, Object[] args) {
		return respView(code, args, null, null);
	}

	public static RespView respView(String code, String customMsg) {
		return respView(code, null, customMsg, null);
	}

	public static RespView respView(String code, Object[] args, String customMsg) {
		return respView(code, args, customMsg, null);
	}

	public static RespView respView(String code, Object[] args, String customMsg, Object body) {
		String msg = null;
		if (customMsg != null) {
			// 优先使用自定义msg
			msg = getMessageSource().getMessage(null, args, customMsg);
		} else {
			msg = getMessageSource().getMessage("rc." + code, args);
		}
		return new RespView().setCode(code).setMsg(msg).setTime(System.currentTimeMillis()).setBody(body);
	}

	public static RespView respView(BusinessException exception) {
		return respView(exception.getCode(), exception.getArgs(), exception.getMsg(), null);
	}

}
