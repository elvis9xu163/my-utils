package com.xjd.utils.my.web.respcode;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * @author elvis.xu
 * @since 2017-08-25 15:47
 */
@Getter
@Setter
@JsonPropertyOrder({"code", "msg", "time"})
public class RespView {
	private String code;
	private String msg;
	private Long time;

	@JsonUnwrapped
	private Object body;

	public RespView code(String code) {
		this.code = code;
		return this;
	}

	public RespView msg(String msg) {
		this.msg = msg;
		return this;
	}

	public RespView time(Long time) {
		this.time = time;
		return this;
	}

	public RespView body(Object body) {
		this.body = body;
		return this;
	}

	@Override
	public String toString() {
		return "RespView[" + "code='" + code + ", msg='" + msg + ", time=" + time + ", body=" + body + ']';
	}
}
