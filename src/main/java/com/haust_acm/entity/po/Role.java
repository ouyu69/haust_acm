package com.haust_acm.entity.po;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.haust_acm.enums.DateTimePatternEnum;
import com.haust_acm.utils.DateUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * @Description 
 * @Date 2025-09-15
 * @Author ouyu
 **/
public class Role implements Serializable {

	/**
	 * 角色id
	 **/
	private Integer roleId;

	/**
	 * 角色名称
	 **/
	private String roleName;

	/**
	 * 角色描述
	 **/
	private String description;

	/**
	 * 角色创建时间
	 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 角色最近一次更新时间
	 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	/**
	 * 角色状态 0:正常,1:废除,
	 **/
	@JsonIgnore
	private Integer status;

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "角色id:" + (roleId == null ? "空" : roleId) + ",角色名称:" + (roleName == null ? "空" : roleName) + ",角色描述:" + (description == null ? "空" : description) + ",角色创建时间:" + (createTime == null ? "空" : DateUtils.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + ",角色最近一次更新时间:" + (updateTime == null ? "空" : DateUtils.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + ",角色状态 0:正常,1:废除,:" + (status == null ? "空" : status);
	}
}