package com.haust_acm.service;

import com.haust_acm.entity.po.Role;
import com.haust_acm.entity.query.RoleQuery;
import com.haust_acm.entity.vo.PaginationResultVO;
import java.util.List;

/**
 * @Description Service
 * @Date 2025-09-15
 * @Author ouyu
 **/
public interface RoleService {
	/**
	 * 根据条件查询数量
	 **/
	List<Role> findListByParam(RoleQuery roleQuery);

	/**
	 * 根据条件查询列表
	 **/
	Long findCountByParam(RoleQuery roleQuery);

	/**
	 * 分页查询
	 **/
	PaginationResultVO<Role> findByPage(RoleQuery roleQuery);

	/**
	 * 新增
	 **/
	Long add(Role bean);

	/**
	 * 批量新增
	 **/
	Long addBatch(List<Role> listBean);

	/**
	 * 批量新增或更新
	 **/
	Long addOrUpdateBatch(List<Role> listBean);

	/**
	 * 根据RoleId查询
	 **/
	Role getRoleByRoleId(Integer roleId);

	/**
	 * 根据RoleId删除
	 **/
	Long deleteRoleByRoleId(Integer roleId);

	/**
	 * 根据RoleId更新
	 **/
	Long updateRoleByRoleId(Role bean, Integer roleId);

}
