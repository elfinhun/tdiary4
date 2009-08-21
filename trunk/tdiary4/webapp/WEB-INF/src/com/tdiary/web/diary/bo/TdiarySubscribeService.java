package com.tdiary.web.diary.bo;

import com.tdiary.common.service.GenericService;
import com.tdiary.web.diary.model.TdiarySubscribe;

public interface TdiarySubscribeService extends GenericService<TdiarySubscribe> {

	void removeByTdiarySeq(int tdiarySeq);

}
