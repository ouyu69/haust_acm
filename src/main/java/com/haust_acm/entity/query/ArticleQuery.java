package com.haust_acm.entity.query;

import java.util.Date;

/**
 * @Description 文章查询对象
 * @Date 2025-09-15
 * @Author ouyu
 **/
public class ArticleQuery extends BaseQuery {
	/**
	 * 文章id
	 **/
	private Long articleId;

	/**
	 * 文章所属用户id
	 **/
	private Long userId;

	/**
	 * 文章的标题
	 **/
	private String articleTitle;

	/**
	 * 文章的正文
	 **/
	private String articleBody;

	/**
	 * 文章状态 0:正常,1:删除
	 **/
	private Integer status;

	/**
	 * 文章发布时间
	 **/
	private Date publishTime;

	/**
	 * 文章最近一次的更新时间
	 **/
	private Date updateTime;

	/**
	 * 文章的标题,模糊查询
	 **/
	private String articleTitleFuzzy;

	/**
	 * 文章的正文,模糊查询
	 **/
	private String articleBodyFuzzy;

	/**
	 * 文章发布时间,开始时间
	 **/
	private String publishTimeStart;

	/**
	 * 文章发布时间,结束时间
	 **/
	private String publishTimeEnd;

	/**
	 * 文章最近一次的更新时间,开始时间
	 **/
	private String updateTimeStart;

	/**
	 * 文章最近一次的更新时间,结束时间
	 **/
	private String updateTimeEnd;


	public Long getArticleId() {
		return articleId ;
	}

	public void setArticleId(Long articleId) {
		this.articleId = articleId ;
	}

	public Long getUserId() {
		return userId ;
	}

	public void setUserId(Long userId) {
		this.userId = userId ;
	}

	public String getArticleTitle() {
		return articleTitle ;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle ;
	}

	public String getArticleBody() {
		return articleBody ;
	}

	public void setArticleBody(String articleBody) {
		this.articleBody = articleBody ;
	}

	public Integer getStatus() {
		return status ;
	}

	public void setStatus(Integer status) {
		this.status = status ;
	}

	public Date getPublishTime() {
		return publishTime ;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime ;
	}

	public Date getUpdateTime() {
		return updateTime ;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime ;
	}

	public String getArticleTitleFuzzy() {
		return articleTitleFuzzy ;
	}

	public void setArticleTitleFuzzy(String articleTitleFuzzy) {
		this.articleTitleFuzzy = articleTitleFuzzy ;
	}

	public String getArticleBodyFuzzy() {
		return articleBodyFuzzy ;
	}

	public void setArticleBodyFuzzy(String articleBodyFuzzy) {
		this.articleBodyFuzzy = articleBodyFuzzy ;
	}

	public String getPublishTimeStart() {
		return publishTimeStart ;
	}

	public void setPublishTimeStart(String publishTimeStart) {
		this.publishTimeStart = publishTimeStart ;
	}

	public String getPublishTimeEnd() {
		return publishTimeEnd ;
	}

	public void setPublishTimeEnd(String publishTimeEnd) {
		this.publishTimeEnd = publishTimeEnd ;
	}

	public String getUpdateTimeStart() {
		return updateTimeStart ;
	}

	public void setUpdateTimeStart(String updateTimeStart) {
		this.updateTimeStart = updateTimeStart ;
	}

	public String getUpdateTimeEnd() {
		return updateTimeEnd ;
	}

	public void setUpdateTimeEnd(String updateTimeEnd) {
		this.updateTimeEnd = updateTimeEnd ;
	}

}