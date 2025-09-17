package com.haust_acm.service.impl;

import com.haust_acm.service.UserService;
import com.haust_acm.entity.po.User;
import com.haust_acm.entity.query.UserQuery;
import com.haust_acm.entity.vo.PaginationResultVO;
import com.haust_acm.mapper.UserMapper;
import com.haust_acm.entity.query.SimplePage;
import com.haust_acm.enums.PageSize;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Description 用户
 * @Date 2025-09-15
 * @Author ouyu
 **/
@Service("UserService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserMapper<User,UserQuery> userMapper;

	/**
	 * 根据条件查询列表
	 **/
	@Override
	public List<User> findListByParam(UserQuery query) {
		return this.userMapper.selectList(query);
	}

	/**
	 * 根据条件查询数量
	 **/
	@Override
	public Long findCountByParam(UserQuery query) {
		return this.userMapper.selectCount(query);
	}

	/**
	 * 分页查询
	 **/
	@Override
	public PaginationResultVO<User> findByPage(UserQuery query) {
		Long count = this.findCountByParam(query);
		Long pageSize = query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<User> list = this.findListByParam(query);
		PaginationResultVO<User> result = new PaginationResultVO<>(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(),list);
		return result;
 	}

	/**
	 * 新增
	 **/
	@Override
	public Long add(User bean) {
		return this.userMapper.insert(bean);
	}

	/**
	 * 批量新增
	 **/
	@Override
	public Long addBatch(List<User> list) {
		return this.userMapper.insertBatch(list);
	}

	/**
	 * 批量新增或更新
	 **/
	@Override
	public Long addOrUpdateBatch(List<User> list) {
		return this.userMapper.insertOrUpdateBatch(list);
	}

	/**
	 * 根据UserId查询
	 **/
	@Override
	public User getUserByUserId(Long userId) {
		return this.userMapper.selectByUserId(userId);
	}

	/**
	 * 根据UserId删除
	 **/
	@Override
	public Long deleteUserByUserId(Long userId) {
		return this.userMapper.deleteByUserId(userId);
	}

	/**
	 * 根据UserId更新
	 **/
	@Override
	public Long updateUserByUserId(User bean, Long userId) {
		return this.userMapper.updateByUserId(bean,userId);
	}

	/**
	 * 根据邮箱查询
	 **/
	@Override
	public User getUserByEmail(String email) {
		return this.userMapper.selectByEmail(email);
	}
}
