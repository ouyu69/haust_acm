package com.haust_acm.service;

import com.haust_acm.entity.po.Article;
import com.haust_acm.entity.query.ArticleQuery;
import com.haust_acm.entity.vo.PaginationResultVO;
import java.util.List;

/**
 * @Description 文章Service
 * @Date 2025-09-13
 * @Author ouyu
 **/
public interface ArticleService {
	/**
	 * 根据条件查询数量
	 **/
	List<Article> findListByParam(ArticleQuery articleQuery);

	/**
	 * 根据条件查询列表
	 **/
	Long findCountByParam(ArticleQuery articleQuery);

	/**
	 * 分页查询
	 **/
	PaginationResultVO<Article> findByPage(ArticleQuery articleQuery);

	/**
	 * 新增
	 **/
	Long add(Article bean);

	/**
	 * 批量新增
	 **/
	Long addBatch(List<Article> listBean);

	/**
	 * 批量新增或更新
	 **/
	Long addOrUpdateBatch(List<Article> listBean);

	/**
	 * 根据ArticleId查询
	 **/
	Article getArticleByArticleId(Long articleId);

	/**
	 * 根据ArticleId删除
	 **/
	Long deleteArticleByArticleId(Long articleId);

	/**
	 * 根据ArticleId更新
	 **/
	Long updateArticleByArticleId(Article bean, Long articleId);

}
