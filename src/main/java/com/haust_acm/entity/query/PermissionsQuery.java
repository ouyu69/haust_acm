package com.haust_acm.entity.query;

import java.util.Date;

/**
 * @Description 权限查询对象
 * @Date 2025-09-13
 * @Author ouyu
 **/
public class PermissionsQuery extends BaseQuery {
	/**
	 * 权限id
	 **/
	private Integer permissionId;

	/**
	 * 权限名称
	 **/
	private String permissionName;

	/**
	 * 权限描述
	 **/
	private String description;

	/**
	 * 权限创建时间
	 **/
	private Date createTime;

	/**
	 * 权限更新时间
	 **/
	private Date updateTime;

	/**
	 * 权限状态 0:正常,1:废除
	 **/
	private Integer status;

	/**
	 * 权限名称,模糊查询
	 **/
	private String permissionNameFuzzy;

	/**
	 * 权限描述,模糊查询
	 **/
	private String descriptionFuzzy;

	/**
	 * 权限创建时间,开始时间
	 **/
	private String createTimeStart;

	/**
	 * 权限创建时间,结束时间
	 **/
	private String createTimeEnd;

	/**
	 * 权限更新时间,开始时间
	 **/
	private String updateTimeStart;

	/**
	 * 权限更新时间,结束时间
	 **/
	private String updateTimeEnd;


	public Integer getPermissionId() {
		return permissionId ;
	}

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId ;
	}

	public String getPermissionName() {
		return permissionName ;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName ;
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

	public String getPermissionNameFuzzy() {
		return permissionNameFuzzy ;
	}

	public void setPermissionNameFuzzy(String permissionNameFuzzy) {
		this.permissionNameFuzzy = permissionNameFuzzy ;
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