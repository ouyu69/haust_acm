package com.haust_acm.mapper;

import org.apache.ibatis.annotations.Param;

public interface PermissionsMapper<T, P> extends BaseMapper<T, P> {

	/**
	 * 根据PermissionId查询
	 **/
	T selectByPermissionId(@Param("permissionId") Integer permissionId);

	/**
	 * 根据PermissionId删除
	 **/
	Long deleteByPermissionId(@Param("permissionId") Integer permissionId);

	/**
	 * 根据PermissionId更新
	 **/
	Long updateByPermissionId(@Param("bean") T t, @Param("permissionId") Integer permissionId);


}
