package com.haust_acm.service.impl;

import com.haust_acm.service.RolePermissionsService;
import com.haust_acm.entity.po.RolePermissions;
import com.haust_acm.entity.query.RolePermissionsQuery;
import com.haust_acm.entity.vo.PaginationResultVO;
import com.haust_acm.mapper.RolePermissionsMapper;
import com.haust_acm.entity.query.SimplePage;
import com.haust_acm.enums.PageSize;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Description 
 * @Date 2025-09-15
 * @Author ouyu
 **/
@Service("RolePermissionsService")
public class RolePermissionsServiceImpl implements RolePermissionsService {
	@Resource
	private RolePermissionsMapper<RolePermissions,RolePermissionsQuery> rolePermissionsMapper;

	/**
	 * 根据条件查询列表
	 **/
	@Override
	public List<RolePermissions> findListByParam(RolePermissionsQuery query) {
		return this.rolePermissionsMapper.selectList(query);
	}

	/**
	 * 根据条件查询数量
	 **/
	@Override
	public Long findCountByParam(RolePermissionsQuery query) {
		return this.rolePermissionsMapper.selectCount(query);
	}

	/**
	 * 分页查询
	 **/
	@Override
	public PaginationResultVO<RolePermissions> findByPage(RolePermissionsQuery query) {
		Long count = this.findCountByParam(query);
		Long pageSize = query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<RolePermissions> list = this.findListByParam(query);
		PaginationResultVO<RolePermissions> result = new PaginationResultVO<>(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(),list);
		return result;
 	}

	/**
	 * 新增
	 **/
	@Override
	public Long add(RolePermissions bean) {
		return this.rolePermissionsMapper.insert(bean);
	}

	/**
	 * 批量新增
	 **/
	@Override
	public Long addBatch(List<RolePermissions> list) {
		return this.rolePermissionsMapper.insertBatch(list);
	}

	/**
	 * 批量新增或更新
	 **/
	@Override
	public Long addOrUpdateBatch(List<RolePermissions> list) {
		return this.rolePermissionsMapper.insertOrUpdateBatch(list);
	}

	/**
	 * 根据RoleIdAndPermissionId查询
	 **/
	@Override
	public RolePermissions getRolePermissionsByRoleIdAndPermissionId(Integer roleId, Integer permissionId) {
		return this.rolePermissionsMapper.selectByRoleIdAndPermissionId(roleId,permissionId);
	}

	/**
	 * 根据RoleIdAndPermissionId删除
	 **/
	@Override
	public Long deleteRolePermissionsByRoleIdAndPermissionId(Integer roleId, Integer permissionId) {
		return this.rolePermissionsMapper.deleteByRoleIdAndPermissionId(roleId,permissionId);
	}

	/**
	 * 根据RoleIdAndPermissionId更新
	 **/
	@Override
	public Long updateRolePermissionsByRoleIdAndPermissionId(RolePermissions bean, Integer roleId, Integer permissionId) {
		return this.rolePermissionsMapper.updateByRoleIdAndPermissionId(bean,roleId,permissionId);
	}

}
