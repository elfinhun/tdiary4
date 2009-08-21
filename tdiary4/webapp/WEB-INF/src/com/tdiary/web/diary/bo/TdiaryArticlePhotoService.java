package com.tdiary.web.diary.bo;

import com.tdiary.common.service.GenericService;
import com.tdiary.web.diary.model.TdiaryArticlePhoto;

public interface TdiaryArticlePhotoService extends GenericService<TdiaryArticlePhoto> {

	void removeByTdiaryArticleSeq(int tdiaryArticleSeq);

}
