/**
 * 
 */
package com.tdiary.web.board.notice.model;

import java.util.Date;

public class Notice {
	int noticeSeq;
	String noticeTitle;
	String noticeContent;
	String attachment;
	String attachmentServer;
	int createUser;
	Date createDate;
	int updateUser;
	Date updateDate;
	
	public Notice(){}
	public Notice(String noticeTitle, String noticeContent,
			String attachment, String attachmentServer, int createUser,
			Date createDate, int updateUser, Date updateDate) {
		super();
		this.noticeTitle = noticeTitle;
		this.noticeContent = noticeContent;
		this.attachment = attachment;
		this.attachmentServer = attachmentServer;
		this.createUser = createUser;
		this.createDate = createDate;
		this.updateUser = updateUser;
		this.updateDate = updateDate;
	}
	
	public int getNoticeSeq() {
		return noticeSeq;
	}
	public void setNoticeSeq(int noticeSeq) {
		this.noticeSeq = noticeSeq;
	}
	public String getNoticeTitle() {
		return noticeTitle;
	}
	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}
	public String getNoticeContent() {
		return noticeContent;
	}
	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
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
	public int getCreateUser() {
		return createUser;
	}
	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(int updateUser) {
		this.updateUser = updateUser;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}
