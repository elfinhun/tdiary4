package com.tdiary.web.board.notice.action;

import java.util.Date;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.tdiary.web.board.notice.bo.NoticeService;
import com.tdiary.web.board.notice.model.Notice;

public class NoticeAtion {
	
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Notice getNotice() {
		return notice;
	}

	public void setNotice(Notice notice) {
		this.notice = notice;
	}

	public List<Notice> getNoticelist() {
		return noticelist;
	}

	public void setNoticelist(List<Notice> noticelist) {
		this.noticelist = noticelist;
	}

	public void setNoticeService(NoticeService noticeService) {
		this.noticeService = noticeService;
	}

	private String noticeContent;
	private Date startDate;
	private Date endDate;

	private Notice notice;
	private List<Notice> noticelist;
	
	private NoticeService noticeService;
		
	public String addNotice(){
		noticeService.create(notice);
		return "success";
	}
	
	public String delNotice(){
		noticeService.remove(notice);
		return "success";
	}
	
	public String editNotice(){
		noticeService.edit(notice);
		return "success";
	}
	
	public String findNotice(){
		noticelist = noticeService.get(title, noticeContent, startDate, endDate);
		return "success";
	}
	
	public String viewNotice(){
		noticelist = noticeService.getList();
		return "success";
	}
}
