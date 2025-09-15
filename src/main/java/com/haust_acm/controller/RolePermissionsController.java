package com.haust_acm.controller;

import com.haust_acm.entity.po.RolePermissions;
import com.haust_acm.service.RolePermissionsService;
import com.haust_acm.entity.query.RolePermissionsQuery;
import com.haust_acm.entity.vo.ResponseVO;

import  org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Description Controller
 * @Date 2025-09-13
 * @Author ouyu
 **/
@RestController
@RequestMapping("/rolePermissions")
public class RolePermissionsController extends ABaseController {
	@Resource
	private RolePermissionsService rolePermissionsService;

	/**
	 * 根据条件分页查询
	 **/
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(RolePermissionsQuery query) {
		return getSuccessResponseVO(rolePermissionsService.findByPage(query));
	}

	/**
	 * 新增
	 **/
	@RequestMapping("add")
	public ResponseVO add(RolePermissions bean) {
		return getSuccessResponseVO(rolePermissionsService.add(bean));
	}

	/**
	 * 批量新增
	 **/
	@RequestMapping("addBatch")
	public ResponseVO addBatch(List<RolePermissions> listBean) {
		return getSuccessResponseVO(rolePermissionsService.addBatch(listBean));
	}

	/**
	 * 批量新增或更新
	 **/
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(List<RolePermissions> listBean) {
		return getSuccessResponseVO(rolePermissionsService.addOrUpdateBatch(listBean));
	}

	/**
	 * 根据RoleIdAndPermissionId查询
	 **/
	@RequestMapping("getRolePermissionsByRoleIdAndPermissionId")
	public ResponseVO getRolePermissionsByRoleIdAndPermissionId(Integer roleId, Integer permissionId) {
		return getSuccessResponseVO(rolePermissionsService.getRolePermissionsByRoleIdAndPermissionId(roleId,permissionId));
	}

	/**
	 * 根据RoleIdAndPermissionId删除
	 **/
	@RequestMapping("deleteRolePermissionsByRoleIdAndPermissionId")
	public ResponseVO deleteRolePermissionsByRoleIdAndPermissionId(Integer roleId, Integer permissionId) {
		return getSuccessResponseVO(rolePermissionsService.deleteRolePermissionsByRoleIdAndPermissionId(roleId,permissionId));
	}

	/**
	 * 根据RoleIdAndPermissionId更新
	 **/
	@RequestMapping("updateRolePermissionsByRoleIdAndPermissionId")
	public ResponseVO updateRolePermissionsByRoleIdAndPermissionId(RolePermissions bean, Integer roleId, Integer permissionId) {
		return getSuccessResponseVO(rolePermissionsService.updateRolePermissionsByRoleIdAndPermissionId(bean,roleId,permissionId));
	}

}
