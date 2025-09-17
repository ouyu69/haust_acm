package com.haust_acm.mapper;

import org.apache.ibatis.annotations.Param;

public interface UserMapper<T, P> extends BaseMapper<T, P> {

	/**
	 * 根据UserId查询
	 **/
	T selectByUserId(@Param("userId") Long userId);

	/**
	 * 根据UserId删除
	 **/
	Long deleteByUserId(@Param("userId") Long userId);

	/**
	 * 根据UserId更新
	 **/
	Long updateByUserId(@Param("bean") T t, @Param("userId") Long userId);

	/**
	 * 根据邮箱查询
	 */
	T selectByEmail(@Param("email") String email);


}
