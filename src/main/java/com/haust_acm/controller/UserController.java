package com.haust_acm.controller;

import com.haust_acm.entity.po.User;
import com.haust_acm.service.UserService;
import com.haust_acm.entity.query.UserQuery;
import com.haust_acm.entity.vo.ResponseVO;

import org.springframework.web.bind.annotation.RequestBody;
import  org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Description 用户Controller
 * @Date 2025-09-15
 * @Author ouyu
 **/
@RestController
@RequestMapping("/user")
public class UserController extends ABaseController {
	@Resource
	private UserService userService;

	/**
	 * 根据条件分页查询
	 **/
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(UserQuery query) {
		return getSuccessResponseVO(userService.findByPage(query),null);
	}

	/**
	 * 新增
	 **/
	@RequestMapping("add")
	public ResponseVO add(User bean) {
		return getSuccessResponseVO(userService.add(bean),null);
	}

	/**
	 * 批量新增
	 **/
	@RequestMapping("addBatch")
	public ResponseVO addBatch(@RequestBody List<User> listBean) {
		return getSuccessResponseVO(userService.addBatch(listBean),null);
	}

	/**
	 * 批量新增或更新
	 **/
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(@RequestBody List<User> listBean) {
		return getSuccessResponseVO(userService.addOrUpdateBatch(listBean),null);
	}

	/**
	 * 根据UserId查询
	 **/
	@RequestMapping("getUserByUserId")
	public ResponseVO getUserByUserId(Long userId) {
		return getSuccessResponseVO(userService.getUserByUserId(userId),null);
	}

	/**
	 * 根据UserId删除
	 **/
	@RequestMapping("deleteUserByUserId")
	public ResponseVO deleteUserByUserId(Long userId) {
		return getSuccessResponseVO(userService.deleteUserByUserId(userId),null);
	}

	/**
	 * 根据UserId更新
	 **/
	@RequestMapping("updateUserByUserId")
	public ResponseVO updateUserByUserId(User bean, Long userId) {
		return getSuccessResponseVO(userService.updateUserByUserId(bean,userId),null);
	}

}
