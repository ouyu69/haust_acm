package com.haust_acm.entity.po;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.haust_acm.enums.DateTimePatternEnum;
import com.haust_acm.utils.DateUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * @Description 权限
 * @Date 2025-09-15
 * @Author ouyu
 **/
public class Permissions implements Serializable {

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
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date createTime;

	/**
	 * 权限更新时间
	 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;

	/**
	 * 权限状态 0:正常,1:废除
	 **/
	@JsonIgnore
	private Integer status;

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}

	public Integer getPermissionId() {
		return permissionId;
	}

	public void setPermissionName(String permissionName) {
		this.permissionName = permissionName;
	}

	public String getPermissionName() {
		return permissionName;
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
		return "权限id:" + (permissionId == null ? "空" : permissionId) + ",权限名称:" + (permissionName == null ? "空" : permissionName) + ",权限描述:" + (description == null ? "空" : description) + ",权限创建时间:" + (createTime == null ? "空" : DateUtils.format(createTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + ",权限更新时间:" + (updateTime == null ? "空" : DateUtils.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + ",权限状态 0:正常,1:废除:" + (status == null ? "空" : status);
	}
}