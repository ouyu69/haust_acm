package com.haust_acm.entity.query;

import java.util.Date;

/**
 * @Description 用户查询对象
 * @Date 2025-09-13
 * @Author ouyu
 **/
public class UserQuery extends BaseQuery {
	/**
	 * 用户id
	 **/
	private Long userId;

	/**
	 * 用户名
	 **/
	private String userName;

	/**
	 * 用户邮箱
	 **/
	private String emai;

	/**
	 * 用户密码
	 **/
	private String password;

	/**
	 * 用户状态 0:为正常，1为封禁，3为删除
	 **/
	private Integer status;

	/**
	 * 用户创建时间
	 **/
	private Date createTime;

	/**
	 * 用户最后一次登录时间
	 **/
	private Date lastLogin;

	/**
	 * 角色id
	 **/
	private Integer roleId;

	/**
	 * 用户名,模糊查询
	 **/
	private String userNameFuzzy;

	/**
	 * 用户邮箱,模糊查询
	 **/
	private String emaiFuzzy;

	/**
	 * 用户密码,模糊查询
	 **/
	private String passwordFuzzy;

	/**
	 * 用户创建时间,开始时间
	 **/
	private String createTimeStart;

	/**
	 * 用户创建时间,结束时间
	 **/
	private String createTimeEnd;

	/**
	 * 用户最后一次登录时间,开始时间
	 **/
	private String lastLoginStart;

	/**
	 * 用户最后一次登录时间,结束时间
	 **/
	private String lastLoginEnd;


	public Long getUserId() {
		return userId ;
	}

	public void setUserId(Long userId) {
		this.userId = userId ;
	}

	public String getUserName() {
		return userName ;
	}

	public void setUserName(String userName) {
		this.userName = userName ;
	}

	public String getEmai() {
		return emai ;
	}

	public void setEmai(String emai) {
		this.emai = emai ;
	}

	public String getPassword() {
		return password ;
	}

	public void setPassword(String password) {
		this.password = password ;
	}

	public Integer getStatus() {
		return status ;
	}

	public void setStatus(Integer status) {
		this.status = status ;
	}

	public Date getCreateTime() {
		return createTime ;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime ;
	}

	public Date getLastLogin() {
		return lastLogin ;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin ;
	}

	public Integer getRoleId() {
		return roleId ;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId ;
	}

	public String getUserNameFuzzy() {
		return userNameFuzzy ;
	}

	public void setUserNameFuzzy(String userNameFuzzy) {
		this.userNameFuzzy = userNameFuzzy ;
	}

	public String getEmaiFuzzy() {
		return emaiFuzzy ;
	}

	public void setEmaiFuzzy(String emaiFuzzy) {
		this.emaiFuzzy = emaiFuzzy ;
	}

	public String getPasswordFuzzy() {
		return passwordFuzzy ;
	}

	public void setPasswordFuzzy(String passwordFuzzy) {
		this.passwordFuzzy = passwordFuzzy ;
	}

	public String getCreateTimeStart() {
		return createTimeStart ;
	}

	public void setCreateTimeStart(String createTimeStart) {
		this.createTimeStart = createTimeStart ;
	}

	public String getCreateTimeEnd() {
		return createTimeEnd ;
	}

	public void setCreateTimeEnd(String createTimeEnd) {
		this.createTimeEnd = createTimeEnd ;
	}

	public String getLastLoginStart() {
		return lastLoginStart ;
	}

	public void setLastLoginStart(String lastLoginStart) {
		this.lastLoginStart = lastLoginStart ;
	}

	public String getLastLoginEnd() {
		return lastLoginEnd ;
	}

	public void setLastLoginEnd(String lastLoginEnd) {
		this.lastLoginEnd = lastLoginEnd ;
	}

}