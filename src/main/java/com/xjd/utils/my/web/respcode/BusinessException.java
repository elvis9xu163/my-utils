package com.xjd.utils.my.web.respcode;

import java.util.Arrays;

/**
 * 业务异常
 * @author elvis.xu
 * @since 2017-08-25 15:41
 */
public class BusinessException extends RuntimeException {
	private static final long serialVersionUID = -1L;

	/** 异常码 */
	protected String code;
	/** 参数 */
	protected Object[] args;
	/** 异常消息 */
	protected String msg;

	public BusinessException(String code) {
		this(code, null, null, (Throwable) null);
	}

	public BusinessException(String code, Object[] args) {
		this(code, args, null, (Throwable) null);
	}

	public BusinessException(String code, String message) {
		this(code, null, message, (Throwable) null);
	}

	public BusinessException(String code, Object[] args, String message) {
		this(code, args, message, (Throwable) null);
	}

	public BusinessException(String code, Throwable cause) {
		this(code, null, null, cause);
	}

	public BusinessException(String code, Object[] args, Throwable cause) {
		this(code, args, null, cause);
	}

	public BusinessException(String code, String message, Throwable cause) {
		this(code, null, message, cause);
	}

	public BusinessException(String code, Object[] args, String message, Throwable cause) {
		super(cause);
		this.code = code;
		this.args = args;
		this.msg = message;
	}

	public String getCode() {
		return code;
	}

	public Object[] getArgs() {
		return args;
	}

	public String getMsg() {
		return msg;
	}

//	public String toString() {
//		StringBuilder buf = new StringBuilder();
//		buf.append(getClass().getSimpleName());
//		buf.append("[code='" + getCode() + "'");
//		buf.append(", args=" + Arrays.toString(args));
//		buf.append(", msg='" + msg + "']");
//		String message = getLocalizedMessage();
//		buf.append((message != null) ? ": " + message : "");
//		StackTraceElement[] traces = getStackTrace();
//		buf.append(traces.length == 0 ? "" : ": at " + traces[0]);
//		return buf.toString();
//	}

	@Override
	public String getMessage() {
		StringBuilder buf = new StringBuilder();
		buf.append("[code='" + getCode() + "'");
		buf.append(", args=" + Arrays.toString(args));
		buf.append(", msg='" + msg + "']");
		return buf.toString();
	}
}
