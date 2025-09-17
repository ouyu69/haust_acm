package com.haust_acm.entity.po;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;
import com.haust_acm.enums.DateTimePatternEnum;
import com.haust_acm.utils.DateUtils;
import com.fasterxml.jackson.annotation.JsonIgnore;
/**
 * @Description 文章
 * @Date 2025-09-15
 * @Author ouyu
 **/
public class Article implements Serializable {

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
//	@JsonIgnore
	private Integer status;

	/**
	 * 文章发布时间
	 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date publishTime;

	/**
	 * 文章最近一次的更新时间
	 **/
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updateTime;


	public void setArticleId(Long articleId) {
		this.articleId = articleId;
	}

	public Long getArticleId() {
		return articleId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleBody(String articleBody) {
		this.articleBody = articleBody;
	}

	public String getArticleBody() {
		return articleBody;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getStatus() {
		return status;
	}

	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}

	public Date getPublishTime() {
		return publishTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	@Override
	public String toString() {
		return "文章id:" + (articleId == null ? "空" : articleId) + ",文章所属用户id:" + (userId == null ? "空" : userId) + ",文章的标题:" + (articleTitle == null ? "空" : articleTitle) + ",文章的正文:" + (articleBody == null ? "空" : articleBody) + ",文章状态 0:正常,1:删除:" + (status == null ? "空" : status) + ",文章发布时间:" + (publishTime == null ? "空" : DateUtils.format(publishTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern())) + ",文章最近一次的更新时间:" + (updateTime == null ? "空" : DateUtils.format(updateTime, DateTimePatternEnum.YYYY_MM_DD_HH_MM_SS.getPattern()));
	}
}