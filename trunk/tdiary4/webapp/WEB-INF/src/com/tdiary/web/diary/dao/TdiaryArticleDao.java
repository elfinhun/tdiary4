package com.tdiary.web.diary.dao;

import java.util.List;

import com.tdiary.common.dao.GenericDao;
import com.tdiary.web.diary.model.TdiaryArticle;

public interface TdiaryArticleDao extends GenericDao<TdiaryArticle> {
	void increseHitCount();
	void increseReplyCount();
	void insertReply();
	void deleteReply();
	List<TdiaryArticle> listByTdiarySeq(int tdiarySeq);
	List<TdiaryArticle> replyList(int tdiaryArticleSeq);
	void setScrap();
	void freeScrap();
	void deleteByTdiarySeq(int tdiarySeq);
}
