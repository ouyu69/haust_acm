package com.haust_acm.service;

import com.haust_acm.entity.po.User;
import com.haust_acm.entity.query.UserQuery;
import com.haust_acm.entity.vo.PaginationResultVO;
import java.util.List;

/**
 * @Description 用户Service
 * @Date 2025-09-13
 * @Author ouyu
 **/
public interface UserService {
	/**
	 * 根据条件查询数量
	 **/
	List<User> findListByParam(UserQuery userQuery);

	/**
	 * 根据条件查询列表
	 **/
	Long findCountByParam(UserQuery userQuery);

	/**
	 * 分页查询
	 **/
	PaginationResultVO<User> findByPage(UserQuery userQuery);

	/**
	 * 新增
	 **/
	Long add(User bean);

	/**
	 * 批量新增
	 **/
	Long addBatch(List<User> listBean);

	/**
	 * 批量新增或更新
	 **/
	Long addOrUpdateBatch(List<User> listBean);

	/**
	 * 根据UserId查询
	 **/
	User getUserByUserId(Long userId);

	/**
	 * 根据UserId删除
	 **/
	Long deleteUserByUserId(Long userId);

	/**
	 * 根据UserId更新
	 **/
	Long updateUserByUserId(User bean, Long userId);

}
