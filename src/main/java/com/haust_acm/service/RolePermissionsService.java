package com.haust_acm.service;

import com.haust_acm.entity.po.RolePermissions;
import com.haust_acm.entity.query.RolePermissionsQuery;
import com.haust_acm.entity.vo.PaginationResultVO;
import java.util.List;

/**
 * @Description Service
 * @Date 2025-09-15
 * @Author ouyu
 **/
public interface RolePermissionsService {
	/**
	 * 根据条件查询数量
	 **/
	List<RolePermissions> findListByParam(RolePermissionsQuery rolePermissionsQuery);

	/**
	 * 根据条件查询列表
	 **/
	Long findCountByParam(RolePermissionsQuery rolePermissionsQuery);

	/**
	 * 分页查询
	 **/
	PaginationResultVO<RolePermissions> findByPage(RolePermissionsQuery rolePermissionsQuery);

	/**
	 * 新增
	 **/
	Long add(RolePermissions bean);

	/**
	 * 批量新增
	 **/
	Long addBatch(List<RolePermissions> listBean);

	/**
	 * 批量新增或更新
	 **/
	Long addOrUpdateBatch(List<RolePermissions> listBean);

	/**
	 * 根据RoleIdAndPermissionId查询
	 **/
	RolePermissions getRolePermissionsByRoleIdAndPermissionId(Integer roleId, Integer permissionId);

	/**
	 * 根据RoleIdAndPermissionId删除
	 **/
	Long deleteRolePermissionsByRoleIdAndPermissionId(Integer roleId, Integer permissionId);

	/**
	 * 根据RoleIdAndPermissionId更新
	 **/
	Long updateRolePermissionsByRoleIdAndPermissionId(RolePermissions bean, Integer roleId, Integer permissionId);

}
