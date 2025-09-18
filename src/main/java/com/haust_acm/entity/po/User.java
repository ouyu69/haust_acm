package com.haust_acm.entity.po;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.haust_acm.enums.DateTimePatternEnum;
import com.haust_acm.utils.DateUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * @Description 用户
 * @Date 2025-09-15
 * @Author ouyu
 **/
public class User implements Serializable {

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
	 * 头像链接
	 */
	private String avatarUrl;

	/**
	 * 用户创建时间
	 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	/**
	 * 用户最后一次登录时间
	 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date lastLogin;

	/**
	 * 角色id
	 **/
	private Integer roleId;

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return password;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return status;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}


	@Override
	public String toString() {
		return "User{" +
			"用户id=" + userId +
			", 用户名=" + userName +
			", 用户邮箱=" + email +
			", 用户密码=" + password +
			", 用户状态 0:为正常，1为封禁，3为删除=" + status +
			", 头像链接=" + avatarUrl +
			", 用户创建时间=" + createTime +
			",用户信息更新时间=" + updateTime +
			", 用户最后一次登录时间=" + lastLogin +
			", 角色id=" + roleId +
			'}';
	}
}