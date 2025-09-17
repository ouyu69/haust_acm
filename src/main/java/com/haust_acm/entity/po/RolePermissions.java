package com.haust_acm.entity.po;

import java.io.Serializable;

/**
 * @Description 
 * @Date 2025-09-15
 * @Author ouyu
 **/
public class RolePermissions implements Serializable {

	/**
	 * 角色id
	 **/
	private Integer roleId;

	/**
	 * 权限id
	 **/
	private Integer permissionId;

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId;
	}

	public Integer getPermissionId() {
		return permissionId;
	}

	@Override
	public String toString() {
		return "角色id:" + (roleId == null ? "空" : roleId) + ",权限id:" + (permissionId == null ? "空" : permissionId);
	}
}