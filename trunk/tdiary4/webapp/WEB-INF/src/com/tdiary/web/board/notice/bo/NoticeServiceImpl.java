package com.tdiary.web.board.notice.bo;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.tdiary.web.board.notice.dao.NoticeDao;
import com.tdiary.web.board.notice.model.Notice;

public class NoticeServiceImpl implements NoticeService {
	
	NoticeDao noticeDao;

	public void setNoticeDao(NoticeDao noticeDao) {
		this.noticeDao = noticeDao;
	}

	public void create(Notice notice) {
		notice.setCreateDate(Calendar.getInstance().getTime());
		noticeDao.insert(notice);
	}

	public void edit(Notice notice) {
		notice.setUpdateDate(Calendar.getInstance().getTime());
		noticeDao.update(notice);
	}

	public List<Notice> get(String title, String noticeContent, Date startDate, Date endDate) {
		return noticeDao.select(title, noticeContent, startDate, endDate);
	}

	public List<Notice> getList() {
		return noticeDao.getList();          
	}

	public int getRowCount() {
		return noticeDao.getRowCount();
	}

	public void remove(Notice notice) {
		noticeDao.delete(notice);
	}
}
