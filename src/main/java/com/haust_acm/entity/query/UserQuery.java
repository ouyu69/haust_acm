package com.haust_acm.entity.query;

import java.util.Date;

/**
 * @Description 用户查询对象
 * @Date 2025-09-15
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
	private String email;

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
	private Date UpdateTime;

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
	private String emailFuzzy;

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
	/**
	 * 用户更新时间,开始时间
	 */
	private String updateTimeStart;
	/**
	 * 用户更新时间,结束时间
	 */
	private String updateTimeEnd;
	/**
	 * 用户头像
	 */
	private String avatarUrl;


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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String getEmailFuzzy() {
		return emailFuzzy;
	}

	public void setEmailFuzzy(String emailFuzzy) {
		this.emailFuzzy = emailFuzzy;
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

	public Date getUpdateTime() {
		return UpdateTime;
	}

	public void setUpdateTime(Date updateTime) {
		UpdateTime = updateTime;
	}

	public String getUpdateTimeStart() {
		return updateTimeStart;
	}

	public void setUpdateTimeStart(String updateTimeStart) {
		this.updateTimeStart = updateTimeStart;
	}

	public String getUpdateTimeEnd() {
		return updateTimeEnd;
	}

	public void setUpdateTimeEnd(String updateTimeEnd) {
		this.updateTimeEnd = updateTimeEnd;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}
}