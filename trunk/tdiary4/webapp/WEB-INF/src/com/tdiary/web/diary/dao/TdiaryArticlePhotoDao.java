package com.tdiary.web.diary.dao;

import com.tdiary.common.dao.GenericDao;
import com.tdiary.web.diary.model.TdiaryArticlePhoto;

public interface TdiaryArticlePhotoDao extends GenericDao<TdiaryArticlePhoto>{

	void deleteByTdiaryArticleSeq(int tdiaryArticleSeq);
	
}
