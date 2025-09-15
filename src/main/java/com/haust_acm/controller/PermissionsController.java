package com.haust_acm.controller;

import com.haust_acm.entity.po.Permissions;
import com.haust_acm.service.PermissionsService;
import com.haust_acm.entity.query.PermissionsQuery;
import com.haust_acm.entity.vo.ResponseVO;

import  org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Description 权限Controller
 * @Date 2025-09-13
 * @Author ouyu
 **/
@RestController
@RequestMapping("/permissions")
public class PermissionsController extends ABaseController {
	@Resource
	private PermissionsService permissionsService;

	/**
	 * 根据条件分页查询
	 **/
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(PermissionsQuery query) {
		return getSuccessResponseVO(permissionsService.findByPage(query));
	}

	/**
	 * 新增
	 **/
	@RequestMapping("add")
	public ResponseVO add(Permissions bean) {
		return getSuccessResponseVO(permissionsService.add(bean));
	}

	/**
	 * 批量新增
	 **/
	@RequestMapping("addBatch")
	public ResponseVO addBatch(List<Permissions> listBean) {
		return getSuccessResponseVO(permissionsService.addBatch(listBean));
	}

	/**
	 * 批量新增或更新
	 **/
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(List<Permissions> listBean) {
		return getSuccessResponseVO(permissionsService.addOrUpdateBatch(listBean));
	}

	/**
	 * 根据PermissionId查询
	 **/
	@RequestMapping("getPermissionsByPermissionId")
	public ResponseVO getPermissionsByPermissionId(Integer permissionId) {
		return getSuccessResponseVO(permissionsService.getPermissionsByPermissionId(permissionId));
	}

	/**
	 * 根据PermissionId删除
	 **/
	@RequestMapping("deletePermissionsByPermissionId")
	public ResponseVO deletePermissionsByPermissionId(Integer permissionId) {
		return getSuccessResponseVO(permissionsService.deletePermissionsByPermissionId(permissionId));
	}

	/**
	 * 根据PermissionId更新
	 **/
	@RequestMapping("updatePermissionsByPermissionId")
	public ResponseVO updatePermissionsByPermissionId(Permissions bean, Integer permissionId) {
		return getSuccessResponseVO(permissionsService.updatePermissionsByPermissionId(bean,permissionId));
	}

}
