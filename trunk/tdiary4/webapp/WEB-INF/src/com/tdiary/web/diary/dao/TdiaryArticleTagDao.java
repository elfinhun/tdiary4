package com.tdiary.web.diary.dao;

import com.tdiary.common.dao.GenericDao;
import com.tdiary.web.diary.model.TdiaryArticleTag;

public interface TdiaryArticleTagDao extends GenericDao<TdiaryArticleTag>{

	void deleteByTdiaryArticleSeq(int tdiaryArticleSeq);
			
}
