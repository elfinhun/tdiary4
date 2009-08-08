package com.tdiary.web.board.notice.bo;

import java.util.Date;
import java.util.List;

import com.tdiary.web.board.notice.model.Notice;

public interface NoticeService {
	List<Notice> getList();
	int getRowCount();
	List<Notice> get(String title, String noticeContent, Date startDate, Date endDate);
	void create(Notice notice);
	void edit(Notice notice);
	void remove(Notice notice);
}
