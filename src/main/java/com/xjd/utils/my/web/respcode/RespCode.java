package com.xjd.utils.my.web.respcode;

import com.xjd.utils.basic.annotation.Describe;

/**
 * 返回码常量
 * 此处只标出常用返回码,各业务返回码需自行创建接口继承该接口即可
 * @author elvis.xu
 * @since 2017-08-28 11:36
 */
public interface RespCode {

	// ===== 基础(0-9) ===== //
	@Describe("成功")
	String RC_0000 = "0000";

	// ===== 参数内部消化异常(10-29) ===== //
	@Describe("参数{0}不能为空")
	String RC_0010 = "0010";
	@Describe("参数{0}格式错误: {1}")
	String RC_0011 = "0011";
	@Describe("参数{0}必须为有效的枚举值: {1}")
	String RC_0012 = "0012";
	@Describe("参数{0}不在取值范围内: {1}")
	String RC_0013 = "0013";

	// ===== 验证码类异常(30-49) ===== //
	@Describe("验证码输入错误!")
	String RC_0030 = "0030";
	@Describe("验证码验证次数超限,请重新获取!")
	String RC_0031 = "0031";
	@Describe("验证码已过期,请重新获取!")
	String RC_0032 = "0032";
	@Describe("验证码已失效,请重新获取!")
	String RC_0033 = "0033";
	@Describe("请勿与其它业务的验证码混用!")
	String RC_0034 = "0034";

	// ===== 用户类异常(50-99) ===== //
	@Describe("TOKEN无效!")
	String RC_0050 = "0050";
	@Describe("用户不存在!")
	String RC_0051 = "0051";
	@Describe("账号或密码错误!")
	String RC_0052 = "0052";
	@Describe("您尚未登录,请先登录!")
	String RC_0053 = "0053";
	@Describe("用户已被锁定!")
	String RC_0054 = "0054";
	@Describe("密码输入错误!")
	String RC_0055 = "0055";
	@Describe("密码输入错误,您今天还可以尝试{0}次!")
	String RC_0056 = "0056";
	@Describe("今天密码错误次数过多,账户已被锁定,请明天再试!")
	String RC_0057 = "0057";
	@Describe("密码输入错误,您还有{0}次机会!")
	String RC_0058 = "0058";
	@Describe("密码错误次数过多,账户已被锁定,请联系客服!")
	String RC_0059 = "0059";

	@Describe("用户名{0}已被他人注册!")
	String RC_0060 = "0060";
	@Describe("手机{0}已被他人注册!")
	String RC_0061 = "0061";
	@Describe("邮箱{0}已被他人注册!")
	String RC_0062 = "0062";

	// ===== 权限类异常(100-149) ===== //
	@Describe("很抱歉,您无权访问该资源!")
	String RC_0100 = "0100";
	@Describe("很抱歉,您无权操作该资源!")
	String RC_0101 = "0101";

	// ===== 无法处理异常(9000-9999) ===== //
	@Describe("{0}")
	String RC_9000 = "9000"; // 任意错误

	@Describe("访问过于频繁!")
	String RC_9005 = "9005";

	@Describe("请求服务{0}时异常!")
	String RC_9980 = "9980";
	@Describe("请求服务{0}时异常: {1}")
	String RC_9981 = "9981";

	@Describe("系统升级维护中...")
	String RC_9985 = "9985";
	@Describe("系统升级维护中,预计{0}可用.")
	String RC_9986 = "9986";

	@Describe("找不到请求的资源!")
	String RC_9990 = "9990";
	@Describe("找不到请求的资源: {0}")
	String RC_9991 = "9991";
	@Describe("解析请求失败: {0}")
	String RC_9992 = "9992";

	@Describe("系统繁忙,请稍后再试!")
	String RC_9995 = "9995";

	@Describe("系统错误,请重试!")
	String RC_9998 = "9998";
	@Describe("系统错误,请联系客服!")
	String RC_9999 = "9999";
}
