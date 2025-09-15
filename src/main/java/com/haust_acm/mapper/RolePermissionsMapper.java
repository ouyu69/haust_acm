package com.haust_acm.mapper;

import org.apache.ibatis.annotations.Param;

public interface RolePermissionsMapper<T, P> extends BaseMapper<T, P> {

	/**
	 * 根据RoleIdAndPermissionId查询
	 **/
	T selectByRoleIdAndPermissionId(@Param("roleId") Integer roleId, @Param("permissionId") Integer permissionId);

	/**
	 * 根据RoleIdAndPermissionId删除
	 **/
	Long deleteByRoleIdAndPermissionId(@Param("roleId") Integer roleId, @Param("permissionId") Integer permissionId);

	/**
	 * 根据RoleIdAndPermissionId更新
	 **/
	Long updateByRoleIdAndPermissionId(@Param("bean") T t, @Param("roleId") Integer roleId, @Param("permissionId") Integer permissionId);


}
