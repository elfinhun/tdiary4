package com.tdiary.web.diary.bo;

import java.sql.SQLException;
import java.util.List;

import com.tdiary.common.service.GenericService;
import com.tdiary.web.diary.model.TdiaryArticleTag;

public interface TdiaryArticleTagService extends GenericService<TdiaryArticleTag> {

	void removeByTdiaryArticleSeq(int tdiaryArticleSeq) throws SQLException;

	List<TdiaryArticleTag> getListByTdiaryArticleSeq(int tdiaryArticleSeq);

}
