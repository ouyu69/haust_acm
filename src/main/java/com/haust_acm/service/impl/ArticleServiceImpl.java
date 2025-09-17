package com.haust_acm.service.impl;

import com.haust_acm.service.ArticleService;
import com.haust_acm.entity.po.Article;
import com.haust_acm.entity.query.ArticleQuery;
import com.haust_acm.entity.vo.PaginationResultVO;
import com.haust_acm.mapper.ArticleMapper;
import com.haust_acm.entity.query.SimplePage;
import com.haust_acm.enums.PageSize;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 * @Description 文章
 * @Date 2025-09-15
 * @Author ouyu
 **/
@Service("ArticleService")
public class ArticleServiceImpl implements ArticleService {
	@Resource
	private ArticleMapper<Article,ArticleQuery> articleMapper;

	/**
	 * 根据条件查询列表
	 **/
	@Override
	public List<Article> findListByParam(ArticleQuery query) {
		return this.articleMapper.selectList(query);
	}

	/**
	 * 根据条件查询数量
	 **/
	@Override
	public Long findCountByParam(ArticleQuery query) {
		return this.articleMapper.selectCount(query);
	}

	/**
	 * 分页查询
	 **/
	@Override
	public PaginationResultVO<Article> findByPage(ArticleQuery query) {
		Long count = this.findCountByParam(query);
		Long pageSize = query.getPageSize() == null ? PageSize.SIZE15.getSize() : query.getPageSize();
		SimplePage page = new SimplePage(query.getPageNo(), count, pageSize);
		query.setSimplePage(page);
		List<Article> list = this.findListByParam(query);
		PaginationResultVO<Article> result = new PaginationResultVO<>(count, page.getPageSize(), page.getPageNo(), page.getPageTotal(),list);
		return result;
 	}

	/**
	 * 新增
	 **/
	@Override
	public Long add(Article bean) {
		return this.articleMapper.insert(bean);
	}

	/**
	 * 批量新增
	 **/
	@Override
	public Long addBatch(List<Article> list) {
		return this.articleMapper.insertBatch(list);
	}

	/**
	 * 批量新增或更新
	 **/
	@Override
	public Long addOrUpdateBatch(List<Article> list) {
		return this.articleMapper.insertOrUpdateBatch(list);
	}

	/**
	 * 根据ArticleId查询
	 **/
	@Override
	public Article getArticleByArticleId(Long articleId) {
		return this.articleMapper.selectByArticleId(articleId);
	}

	/**
	 * 根据ArticleId删除
	 **/
	@Override
	public Long deleteArticleByArticleId(Long articleId) {
		return this.articleMapper.deleteByArticleId(articleId);
	}

	/**
	 * 根据ArticleId更新
	 **/
	@Override
	public Long updateArticleByArticleId(Article bean, Long articleId) {
		return this.articleMapper.updateByArticleId(bean,articleId);
	}

}
