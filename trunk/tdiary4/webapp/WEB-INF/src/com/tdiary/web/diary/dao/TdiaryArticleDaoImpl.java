package com.tdiary.web.diary.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.tdiary.web.diary.model.TdiaryArticle;

public class TdiaryArticleDaoImpl extends SqlMapClientDaoSupport implements
		TdiaryArticleDao {

	public void deleteByTdiarySeq(int tdiarySeq) {
		// TODO Auto-generated method stub

	}

	public void deleteReply() {
		// TODO Auto-generated method stub

	}

	public void freeScrap() {
		// TODO Auto-generated method stub

	}

	public void increseHitCount() {
		// TODO Auto-generated method stub

	}

	public void increseReplyCount() {
		// TODO Auto-generated method stub

	}

	public void insertReply() {
		// TODO Auto-generated method stub

	}

	public List<TdiaryArticle> listByTdiarySeq(int tdiarySeq) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TdiaryArticle> replyList(int tdiaryArticleSeq) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setScrap() {
		// TODO Auto-generated method stub

	}

	public void delete(Object obj) throws SQLException {
		// TODO Auto-generated method stub

	}

	public int getRowCount(Object rp) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public void insert(TdiaryArticle obj) throws SQLException {
		// TODO Auto-generated method stub

	}

	public List<TdiaryArticle> list(Object rp) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object select(Object obj) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(TdiaryArticle obj) throws SQLException {
		// TODO Auto-generated method stub

	}

}
