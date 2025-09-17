package com.haust_acm.controller;

import com.haust_acm.entity.po.Role;
import com.haust_acm.service.RoleService;
import com.haust_acm.entity.query.RoleQuery;
import com.haust_acm.entity.vo.ResponseVO;

import  org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Description Controller
 * @Date 2025-09-15
 * @Author ouyu
 **/
@RestController
@RequestMapping("/role")
public class RoleController extends ABaseController {
	@Resource
	private RoleService roleService;

	/**
	 * 根据条件分页查询
	 **/
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(RoleQuery query) {
		return getSuccessResponseVO(roleService.findByPage(query),null);
	}

	/**
	 * 新增
	 **/
	@RequestMapping("add")
	public ResponseVO add(Role bean) {
		return getSuccessResponseVO(roleService.add(bean),null);
	}

	/**
	 * 批量新增
	 **/
	@RequestMapping("addBatch")
	public ResponseVO addBatch(List<Role> listBean) {
		return getSuccessResponseVO(roleService.addBatch(listBean),null);
	}

	/**
	 * 批量新增或更新
	 **/
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(List<Role> listBean) {
		return getSuccessResponseVO(roleService.addOrUpdateBatch(listBean),null);
	}

	/**
	 * 根据RoleId查询
	 **/
	@RequestMapping("getRoleByRoleId")
	public ResponseVO getRoleByRoleId(Integer roleId) {
		return getSuccessResponseVO(roleService.getRoleByRoleId(roleId),null);
	}

	/**
	 * 根据RoleId删除
	 **/
	@RequestMapping("deleteRoleByRoleId")
	public ResponseVO deleteRoleByRoleId(Integer roleId) {
		return getSuccessResponseVO(roleService.deleteRoleByRoleId(roleId),null);
	}

	/**
	 * 根据RoleId更新
	 **/
	@RequestMapping("updateRoleByRoleId")
	public ResponseVO updateRoleByRoleId(Role bean, Integer roleId) {
		return getSuccessResponseVO(roleService.updateRoleByRoleId(bean,roleId),null);
	}

}
