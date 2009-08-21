package com.tdiary.web.diary.bo;

import java.sql.SQLException;
import java.util.List;

import com.tdiary.web.diary.dao.TdiaryArticleTagDao;
import com.tdiary.web.diary.model.TdiaryArticleTag;
import com.tdiary.web.diary.model.TdiaryArticleTagCloud;

public class TdiaryArticleTagServiceImpl implements TdiaryArticleTagService {
	TdiaryArticleTagDao tdiaryArticleTagDao;
	TdiaryArticleTagCloudService tdiaryArticleTagCloudService;
	
	public void setTdiaryArticleTagDao(TdiaryArticleTagDao tdiaryArticleTagDao) {
		this.tdiaryArticleTagDao = tdiaryArticleTagDao;
	}

	public void setTdiaryArticleTagCloudService(
			TdiaryArticleTagCloudService tdiaryArticleTagCloudService) {
		this.tdiaryArticleTagCloudService = tdiaryArticleTagCloudService;
	}

	public void removeByTdiaryArticleSeq(int tdiaryArticleSeq) throws SQLException {
		tdiaryArticleTagDao.deleteByTdiaryArticleSeq(tdiaryArticleSeq);
		tdiaryArticleTagCloudService.decreaseCount(tdiaryArticleSeq);
		tdiaryArticleTagCloudService.remove(tdiaryArticleSeq);
	}
	
	public Object create(TdiaryArticleTag obj) throws SQLException{
		tdiaryArticleTagDao.insert(obj);
		TdiaryArticleTagCloud tdiaryArticleTagCloud = null;
		tdiaryArticleTagCloudService.create(tdiaryArticleTagCloud);
		tdiaryArticleTagCloudService.increaseCount(obj);
		return null;
	}

	public List<TdiaryArticleTag> getListByTdiaryArticleSeq(int tdiaryArticleSeq) {
		// TODO Auto-generated method stub
		return null;
	}

	public void edit(TdiaryArticleTag obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public Object get(Object obj) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TdiaryArticleTag> getList(Object rp) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public int getRowCount(Object rp) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	public void remove(Object obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
