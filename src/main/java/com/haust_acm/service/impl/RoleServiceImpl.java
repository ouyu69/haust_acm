package com.haust_acm.service.impl;

import com.haust_acm.service.RoleService;
import com.haust_acm.entity.po.Role;
import com.haust_acm.entity.query.RoleQuery;
import com.haust_acm.entity.vo.PaginationResultVO;
import com.haust_acm.mapper.RoleMapper;
import com.haust_acm.entity.query.SimplePage;
import com.haust_acm.enums.PageSize;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Description 
 * @Date 2025-09-13
 * @Author ouyu
 **/
@Service("RoleService")
public class RoleServiceImpl implements RoleService {
	@Resource
	private RoleMapper<Role,RoleQuery> roleMapper;

	/**
	 * 根据条件查询列表
	 **/
	@Override
	public List<Role> findListByParam(RoleQuery query) {
		return this.roleMapper.selectList(query);
	}

	/**
	 * 根据条件查询数量
	 **/
	@Override
	public Long findCountByParam(RoleQuery query) {
		return this.roleMapper.selectCount(query);
	}

	/**
	 * 分页查询
	 **/
	@Override
	public PaginationResultVO<Role> findByPage(RoleQuery query) {
		Long count = this.findCountByParam(query);
		Long pageSize = query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<Role> list = this.findListByParam(query);
		PaginationResultVO<Role> result = new PaginationResultVO<>(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(),list);
		return result;
 	}

	/**
	 * 新增
	 **/
	@Override
	public Long add(Role bean) {
		return this.roleMapper.insert(bean);
	}

	/**
	 * 批量新增
	 **/
	@Override
	public Long addBatch(List<Role> list) {
		return this.roleMapper.insertBatch(list);
	}

	/**
	 * 批量新增或更新
	 **/
	@Override
	public Long addOrUpdateBatch(List<Role> list) {
		return this.roleMapper.insertOrUpdateBatch(list);
	}

	/**
	 * 根据RoleId查询
	 **/
	@Override
	public Role getRoleByRoleId(Integer roleId) {
		return this.roleMapper.selectByRoleId(roleId);
	}

	/**
	 * 根据RoleId删除
	 **/
	@Override
	public Long deleteRoleByRoleId(Integer roleId) {
		return this.roleMapper.deleteByRoleId(roleId);
	}

	/**
	 * 根据RoleId更新
	 **/
	@Override
	public Long updateRoleByRoleId(Role bean, Integer roleId) {
		return this.roleMapper.updateByRoleId(bean,roleId);
	}

}
