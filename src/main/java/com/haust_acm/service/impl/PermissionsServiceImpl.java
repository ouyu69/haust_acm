package com.haust_acm.service.impl;

import com.haust_acm.service.PermissionsService;
import com.haust_acm.entity.po.Permissions;
import com.haust_acm.entity.query.PermissionsQuery;
import com.haust_acm.entity.vo.PaginationResultVO;
import com.haust_acm.mapper.PermissionsMapper;
import com.haust_acm.entity.query.SimplePage;
import com.haust_acm.enums.PageSize;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Description 权限
 * @Date 2025-09-13
 * @Author ouyu
 **/
@Service("PermissionsService")
public class PermissionsServiceImpl implements PermissionsService {
	@Resource
	private PermissionsMapper<Permissions,PermissionsQuery> permissionsMapper;

	/**
	 * 根据条件查询列表
	 **/
	@Override
	public List<Permissions> findListByParam(PermissionsQuery query) {
		return this.permissionsMapper.selectList(query);
	}

	/**
	 * 根据条件查询数量
	 **/
	@Override
	public Long findCountByParam(PermissionsQuery query) {
		return this.permissionsMapper.selectCount(query);
	}

	/**
	 * 分页查询
	 **/
	@Override
	public PaginationResultVO<Permissions> findByPage(PermissionsQuery query) {
		Long count = this.findCountByParam(query);
		Long pageSize = query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<Permissions> list = this.findListByParam(query);
		PaginationResultVO<Permissions> result = new PaginationResultVO<>(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(),list);
		return result;
 	}

	/**
	 * 新增
	 **/
	@Override
	public Long add(Permissions bean) {
		return this.permissionsMapper.insert(bean);
	}

	/**
	 * 批量新增
	 **/
	@Override
	public Long addBatch(List<Permissions> list) {
		return this.permissionsMapper.insertBatch(list);
	}

	/**
	 * 批量新增或更新
	 **/
	@Override
	public Long addOrUpdateBatch(List<Permissions> list) {
		return this.permissionsMapper.insertOrUpdateBatch(list);
	}

	/**
	 * 根据PermissionId查询
	 **/
	@Override
	public Permissions getPermissionsByPermissionId(Integer permissionId) {
		return this.permissionsMapper.selectByPermissionId(permissionId);
	}

	/**
	 * 根据PermissionId删除
	 **/
	@Override
	public Long deletePermissionsByPermissionId(Integer permissionId) {
		return this.permissionsMapper.deleteByPermissionId(permissionId);
	}

	/**
	 * 根据PermissionId更新
	 **/
	@Override
	public Long updatePermissionsByPermissionId(Permissions bean, Integer permissionId) {
		return this.permissionsMapper.updateByPermissionId(bean,permissionId);
	}

}
