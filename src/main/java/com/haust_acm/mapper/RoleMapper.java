package com.haust_acm.mapper;

import org.apache.ibatis.annotations.Param;

public interface RoleMapper<T, P> extends BaseMapper<T, P> {

	/**
	 * 根据RoleId查询
	 **/
	T selectByRoleId(@Param("roleId") Integer roleId);

	/**
	 * 根据RoleId删除
	 **/
	Long deleteByRoleId(@Param("roleId") Integer roleId);

	/**
	 * 根据RoleId更新
	 **/
	Long updateByRoleId(@Param("bean") T t, @Param("roleId") Integer roleId);


}
