package com.haust_acm.mapper;

import org.apache.ibatis.annotations.Param;

public interface ArticleMapper<T, P> extends BaseMapper<T, P> {

	/**
	 * 根据ArticleId查询
	 **/
	T selectByArticleId(@Param("articleId") Long articleId);

	/**
	 * 根据ArticleId删除
	 **/
	Long deleteByArticleId(@Param("articleId") Long articleId);

	/**
	 * 根据ArticleId更新
	 **/
	Long updateByArticleId(@Param("bean") T t, @Param("articleId") Long articleId);


}
