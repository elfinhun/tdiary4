package com.tdiary.web.diary.dao;

import com.tdiary.common.dao.GenericDao;
import com.tdiary.web.diary.model.TdiaryArticleScrap;

public interface TdiaryArticleScrapDao extends GenericDao<TdiaryArticleScrap> {

	void deleteByTdiaryArticleSeq(int tdiaryArticleSeq);

}
