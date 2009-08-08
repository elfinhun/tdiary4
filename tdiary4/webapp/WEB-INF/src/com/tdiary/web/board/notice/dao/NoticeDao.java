package com.tdiary.web.board.notice.dao;

import java.util.Date;
import java.util.List;

import com.tdiary.web.board.notice.model.Notice;

public interface NoticeDao {
	List<Notice> getList();
	int getRowCount();
	List<Notice> select(String title, String noticeContent, Date startDate, Date endDate);
	void insert(Notice notice);
	void update(Notice notice);
	void delete(Notice notice);
	List<Notice> getLatestList(int max);
}
