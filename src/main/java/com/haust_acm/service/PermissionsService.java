package com.haust_acm.service;

import com.haust_acm.entity.po.Permissions;
import com.haust_acm.entity.query.PermissionsQuery;
import com.haust_acm.entity.vo.PaginationResultVO;
import java.util.List;

/**
 * @Description 权限Service
 * @Date 2025-09-15
 * @Author ouyu
 **/
public interface PermissionsService {
	/**
	 * 根据条件查询数量
	 **/
	List<Permissions> findListByParam(PermissionsQuery permissionsQuery);

	/**
	 * 根据条件查询列表
	 **/
	Long findCountByParam(PermissionsQuery permissionsQuery);

	/**
	 * 分页查询
	 **/
	PaginationResultVO<Permissions> findByPage(PermissionsQuery permissionsQuery);

	/**
	 * 新增
	 **/
	Long add(Permissions bean);

	/**
	 * 批量新增
	 **/
	Long addBatch(List<Permissions> listBean);

	/**
	 * 批量新增或更新
	 **/
	Long addOrUpdateBatch(List<Permissions> listBean);

	/**
	 * 根据PermissionId查询
	 **/
	Permissions getPermissionsByPermissionId(Integer permissionId);

	/**
	 * 根据PermissionId删除
	 **/
	Long deletePermissionsByPermissionId(Integer permissionId);

	/**
	 * 根据PermissionId更新
	 **/
	Long updatePermissionsByPermissionId(Permissions bean, Integer permissionId);

}
