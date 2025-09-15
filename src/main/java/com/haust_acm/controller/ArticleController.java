package com.haust_acm.controller;

import com.haust_acm.entity.po.Article;
import com.haust_acm.service.ArticleService;
import com.haust_acm.entity.query.ArticleQuery;
import com.haust_acm.entity.vo.ResponseVO;

import  org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Description 文章Controller
 * @Date 2025-09-13
 * @Author ouyu
 **/
@RestController
@RequestMapping("/article")
public class ArticleController extends ABaseController {
	@Resource
	private ArticleService articleService;

	/**
	 * 根据条件分页查询
	 **/
	@RequestMapping("loadDataList")
	public ResponseVO loadDataList(ArticleQuery query) {
		return getSuccessResponseVO(articleService.findByPage(query));
	}

	/**
	 * 新增
	 **/
	@RequestMapping("add")
	public ResponseVO add(Article bean) {
		return getSuccessResponseVO(articleService.add(bean));
	}

	/**
	 * 批量新增
	 **/
	@RequestMapping("addBatch")
	public ResponseVO addBatch(List<Article> listBean) {
		return getSuccessResponseVO(articleService.addBatch(listBean));
	}

	/**
	 * 批量新增或更新
	 **/
	@RequestMapping("addOrUpdateBatch")
	public ResponseVO addOrUpdateBatch(List<Article> listBean) {
		return getSuccessResponseVO(articleService.addOrUpdateBatch(listBean));
	}

	/**
	 * 根据ArticleId查询
	 **/
	@RequestMapping("getArticleByArticleId")
	public ResponseVO getArticleByArticleId(Long articleId) {
		return getSuccessResponseVO(articleService.getArticleByArticleId(articleId));
	}

	/**
	 * 根据ArticleId删除
	 **/
	@RequestMapping("deleteArticleByArticleId")
	public ResponseVO deleteArticleByArticleId(Long articleId) {
		return getSuccessResponseVO(articleService.deleteArticleByArticleId(articleId));
	}

	/**
	 * 根据ArticleId更新
	 **/
	@RequestMapping("updateArticleByArticleId")
	public ResponseVO updateArticleByArticleId(Article bean, Long articleId) {
		return getSuccessResponseVO(articleService.updateArticleByArticleId(bean,articleId));
	}

}
