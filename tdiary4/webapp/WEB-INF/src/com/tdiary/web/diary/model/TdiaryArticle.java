package com.tdiary.web.diary.model;

import java.util.Date;

public class TdiaryArticle {
	
	int tdiaryArticleSeq;
	int tdiarySeq;
	int parentTdiaryArticleSeq;
	String tdiaryArticleTitle;
	String tdiaryArticleContent;
	int hitCount;
	int replyCount;
	String attachment;
	String attachmentServer;	
	String scrapCode;
	String remark;
	Date createDate;
	int createUser;
	Date updateDate;
	int updateUser;
	
	
	public int getTdiaryArticleSeq() {
		return tdiaryArticleSeq;
	}
	public void setTdiaryArticleSeq(int tdiaryArticleSeq) {
		this.tdiaryArticleSeq = tdiaryArticleSeq;
	}
	public int getTdiarySeq() {
		return tdiarySeq;
	}
	public void setTdiarySeq(int tdiarySeq) {
		this.tdiarySeq = tdiarySeq;
	}
	public int getParentTdiaryArticleSeq() {
		return parentTdiaryArticleSeq;
	}
	public void setParentTdiaryArticleSeq(int parentTdiaryArticleSeq) {
		this.parentTdiaryArticleSeq = parentTdiaryArticleSeq;
	}
	public String getTdiaryArticleTitle() {
		return tdiaryArticleTitle;
	}
	public void setTdiaryArticleTitle(String tdiaryArticleTitle) {
		this.tdiaryArticleTitle = tdiaryArticleTitle;
	}
	public String getTdiaryArticleContent() {
		return tdiaryArticleContent;
	}
	public void setTdiaryArticleContent(String tdiaryArticleContent) {
		this.tdiaryArticleContent = tdiaryArticleContent;
	}
	public int getHitCount() {
		return hitCount;
	}
	public void setHitCount(int hitCount) {
		this.hitCount = hitCount;
	}
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	public String getAttachment() {
		return attachment;
	}
	public void setAttachment(String attachment) {
		this.attachment = attachment;
	}
	public String getAttachmentServer() {
		return attachmentServer;
	}
	public void setAttachmentServer(String attachmentServer) {
		this.attachmentServer = attachmentServer;
	}
	public String getScrapCode() {
		return scrapCode;
	}
	public void setScrapCode(String scrapCode) {
		this.scrapCode = scrapCode;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getCreateUser() {
		return createUser;
	}
	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public int getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(int updateUser) {
		this.updateUser = updateUser;
	}
	
}
