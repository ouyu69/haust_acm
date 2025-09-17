package com.haust_acm.entity.query;

import java.util.Date;

/**
 * @Description 查询对象
 * @Date 2025-09-15
 * @Author ouyu
 **/
public class RoleQuery extends BaseQuery {
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
	private Date createTime;

	/**
	 * 角色最近一次更新时间
	 **/
	private Date updateTime;

	/**
	 * 角色状态 0:正常,1:废除,
	 **/
	private Integer status;

	/**
	 * 角色名称,模糊查询
	 **/
	private String roleNameFuzzy;

	/**
	 * 角色描述,模糊查询
	 **/
	private String descriptionFuzzy;

	/**
	 * 角色创建时间,开始时间
	 **/
	private String createTimeStart;

	/**
	 * 角色创建时间,结束时间
	 **/
	private String createTimeEnd;

	/**
	 * 角色最近一次更新时间,开始时间
	 **/
	private String updateTimeStart;

	/**
	 * 角色最近一次更新时间,结束时间
	 **/
	private String updateTimeEnd;


	public Integer getRoleId() {
		return roleId ;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId ;
	}

	public String getRoleName() {
		return roleName ;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName ;
	}

	public String getDescription() {
		return description ;
	}

	public void setDescription(String description) {
		this.description = description ;
	}

	public Date getCreateTime() {
		return createTime ;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime ;
	}

	public Date getUpdateTime() {
		return updateTime ;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime ;
	}

	public Integer getStatus() {
		return status ;
	}

	public void setStatus(Integer status) {
		this.status = status ;
	}

	public String getRoleNameFuzzy() {
		return roleNameFuzzy ;
	}

	public void setRoleNameFuzzy(String roleNameFuzzy) {
		this.roleNameFuzzy = roleNameFuzzy ;
	}

	public String getDescriptionFuzzy() {
		return descriptionFuzzy ;
	}

	public void setDescriptionFuzzy(String descriptionFuzzy) {
		this.descriptionFuzzy = descriptionFuzzy ;
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

	public String getUpdateTimeStart() {
		return updateTimeStart ;
	}

	public void setUpdateTimeStart(String updateTimeStart) {
		this.updateTimeStart = updateTimeStart ;
	}

	public String getUpdateTimeEnd() {
		return updateTimeEnd ;
	}

	public void setUpdateTimeEnd(String updateTimeEnd) {
		this.updateTimeEnd = updateTimeEnd ;
	}

}