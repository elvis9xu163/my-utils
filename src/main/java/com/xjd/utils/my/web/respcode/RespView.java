package com.xjd.utils.my.web.respcode;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

/**
 * @author elvis.xu
 * @since 2017-08-25 15:47
 */
@Getter
@Setter
@Accessors(chain = true)
@JsonPropertyOrder({"code", "msg", "time"})
public class RespView {
	private String code;
	private String msg;
	private Long time;

	@JsonUnwrapped
	private Object body;

	@Override
	public String toString() {
		return "RespView[" + "code='" + code + ", msg='" + msg + ", time=" + time + ", body=" + body + ']';
	}
}
