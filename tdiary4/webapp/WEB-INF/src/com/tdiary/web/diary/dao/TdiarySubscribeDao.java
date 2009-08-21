package com.tdiary.web.diary.dao;

import com.tdiary.common.dao.GenericDao;
import com.tdiary.web.diary.model.TdiarySubscribe;

public interface TdiarySubscribeDao extends GenericDao<TdiarySubscribe> {

	void deleteByTdiarySeq(int tdiarySeq);
	
}
