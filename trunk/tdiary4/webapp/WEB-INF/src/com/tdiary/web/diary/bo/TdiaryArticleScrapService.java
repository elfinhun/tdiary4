package com.tdiary.web.diary.bo;

import com.tdiary.common.service.GenericService;
import com.tdiary.web.diary.model.TdiaryArticleScrap;

public interface TdiaryArticleScrapService extends GenericService<TdiaryArticleScrap> {

	void removeByTdiaryArticleSeq(int tdiaryArticleSeq);

}
