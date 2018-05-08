package com.example.demo.entity;


import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public User() {
	}

	public User(String userName, String pwd, String mobilePhone, Date addTime) {
		this.userName = userName;
		this.pwd = pwd;
		this.mobilePhone = mobilePhone;
		this.addTime = addTime;
	}

	/**
	 * 用户ID
	 */
	private long userId;

	/**
	 * 汇付返回用户客户号
	 */
	private String userCustId;

	/**
	 * 用户名
	 */
	private String userName;

	/**
	 * 用户密码
	 */
	private String pwd;

	/**
	 * 支付密码
	 */
	private String payPwd;

	/**
	 * 真实姓名
	 */
	private String realName;

	/**
	 * 电子邮件
	 */
	private String email;

	/**
	 * 手机号码
	 */
	private String mobilePhone;

	/**
	 * 添加时间
	 */
	private Date addTime;

	/**
	 * 证件号码
	 */
	private String cardId;

	/**
	 * 多账户绑定ID
	 */
	private Long bindId;

	/**
	 * 多账户绑定时间
	 */
	private Date bindTime;

	/**
	 * 微信平台ID
	 */
	private String wechatId;

	/**
	 * 微信open id
	 */
	private String wechatOpenId;

	/**
	 * 微信绑定时间
	 */
	private Date wechatBindTime;

	

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserCustId() {
		return userCustId;
	}

	public void setUserCustId(String userCustId) {
		this.userCustId = userCustId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPayPwd() {
		return payPwd;
	}

	public void setPayPwd(String payPwd) {
		this.payPwd = payPwd;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public Date getAddTime() {
		return addTime;
	}

	public void setAddTime(Date addTime) {
		this.addTime = addTime;
	}

	public String getCardId() {
		return cardId;
	}

	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	public Long getBindId() {
		return bindId;
	}

	public void setBindId(Long bindId) {
		this.bindId = bindId;
	}

	public Date getBindTime() {
		return bindTime;
	}

	public void setBindTime(Date bindTime) {
		this.bindTime = bindTime;
	}

	public String getWechatId() {
		return wechatId;
	}

	public void setWechatId(String wechatId) {
		this.wechatId = wechatId;
	}

	public String getWechatOpenId() {
		return wechatOpenId;
	}

	public void setWechatOpenId(String wechatOpenId) {
		this.wechatOpenId = wechatOpenId;
	}

	public Date getWechatBindTime() {
		return wechatBindTime;
	}

	public void setWechatBindTime(Date wechatBindTime) {
		this.wechatBindTime = wechatBindTime;
	}

}
