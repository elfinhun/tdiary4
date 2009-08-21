package com.tdiary.web.diary.bo;

import java.sql.SQLException;
import java.util.List;

import com.tdiary.common.service.GenericService;
import com.tdiary.web.diary.model.TdiaryArticle;

public interface TdiaryArticleService extends GenericService<TdiaryArticle> {

	void removeByTdiarySeq(int tdiarySeq) throws SQLException;

	List<TdiaryArticle> getListByTdiarySeq(int tdiarySeq);

}
