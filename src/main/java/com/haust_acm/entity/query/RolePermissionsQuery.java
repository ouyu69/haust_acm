package com.haust_acm.entity.query;


/**
 * @Description 查询对象
 * @Date 2025-09-15
 * @Author ouyu
 **/
public class RolePermissionsQuery extends BaseQuery {
	/**
	 * 角色id
	 **/
	private Integer roleId;

	/**
	 * 权限id
	 **/
	private Integer permissionId;


	public Integer getRoleId() {
		return roleId ;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId ;
	}

	public Integer getPermissionId() {
		return permissionId ;
	}

	public void setPermissionId(Integer permissionId) {
		this.permissionId = permissionId ;
	}

}