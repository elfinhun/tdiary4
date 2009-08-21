package com.tdiary.web.diary.bo;

import com.tdiary.common.service.GenericService;
import com.tdiary.web.diary.model.TdiaryArticleTag;
import com.tdiary.web.diary.model.TdiaryArticleTagCloud;

public interface TdiaryArticleTagCloudService extends GenericService<TdiaryArticleTagCloud> {

	void decreaseCount(int tdiaryArticleSeq);

	void increaseCount(TdiaryArticleTag obj);

}
