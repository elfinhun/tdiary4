package com.tdiary.web.board.notice.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.tdiary.web.board.notice.model.Notice;

public class NoticeDaoImpl extends SqlMapClientDaoSupport implements NoticeDao {

	public void delete(Notice notice) {
		getSqlMapClientTemplate().delete("deleteNotice", notice.getNoticeSeq());

	}

	@SuppressWarnings("unchecked")
	public List<Notice> getLatestList(int max) {
		return getSqlMapClientTemplate().queryForList("getLatestNoticeList",max);
	}

	@SuppressWarnings("unchecked")
	public List<Notice> getList() {
		return getSqlMapClientTemplate().queryForList("getNoticeList");
	}

	public int getRowCount() {
		return  (Integer)getSqlMapClientTemplate().queryForObject("getNoticeCount");
	}

	public void insert(Notice notice) {                                                                                                                                                                                                                                             
		getSqlMapClientTemplate().insert("insertNotice",notice);
	}

	@SuppressWarnings("unchecked")
	public List<Notice> select(String title, String noticeContent, Date startDate, Date endDate) {
		HashMap paramMap = new HashMap();
		paramMap.put("title", title);
		paramMap.put("noticeContent", noticeContent);
		paramMap.put("startDate", startDate);
		paramMap.put("endDate", endDate);
		return getSqlMapClientTemplate().queryForList("selectNotice", paramMap);
	}

	public void update(Notice notice) {
		getSqlMapClientTemplate().update("updateNotice", notice);
	}
}

/*

CREATE TABLE NOTICE (
       NOTICE_SEQ           int AUTO_INCREMENT PRIMARY KEY,
       NOTICE_TITLE         varchar(100) NULL,
       NOTICE_CONTENT       text NULL,
       ATTACHMENT           varchar(255) NULL,
       ATTACHMENT_SERVER    varchar(255) NULL,
       CREATE_DATE          datetime NULL,
       CREATE_USER          int NOT NULL,
       UPDATE_DATE          datetime NULL,
       UPDATE_USER          int NOT NULL
);


CREATE TABLE USER_INFO (
USER_SEQ             int AUTO_INCREMENT PRIMARY KEY,
USER_ID              varchar(20) NULL,
PASSWORD             varchar(20) NULL,
NAME                 varchar(100) NULL,
PHONE_NO             varchar(20) NULL,
ADDRESS              varchar(255) NULL,
RESIDENT_NO          varchar(13) NULL,
JOB_CODE             varchar(30) NULL,
SYSTEM_USE_CODE      varchar(30) NULL,
CREATE_DATE          datetime NULL,
UPDATE_DATE          datetime NULL
);

ALTER TABLE NOTICE
       ADD FOREIGN KEY (CREATE_USER)
                             REFERENCES USER_INFO  (USER_SEQ);

ALTER TABLE NOTICE
       ADD FOREIGN KEY (UPDATE_USER)
                             REFERENCES USER_INFO  (USER_SEQ);

 */
