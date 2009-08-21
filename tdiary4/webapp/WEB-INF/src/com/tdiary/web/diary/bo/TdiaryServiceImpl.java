package com.tdiary.web.diary.bo;

import java.sql.SQLException;
import java.util.List;

import com.tdiary.web.diary.dao.TdiaryDao;
import com.tdiary.web.diary.model.Tdiary;

public class TdiaryServiceImpl  implements
		TdiaryService {

	TdiaryDao tdiaryDao ;
	TdiarySubscribeService tdiarySubscribeService;
	public void setTdiaryDao(TdiaryDao tdiaryDao) {
		this.tdiaryDao = tdiaryDao;
	}

	public void setTdiarySubscribeService(
			TdiarySubscribeService tdiarySubscribeService) {
		this.tdiarySubscribeService = tdiarySubscribeService;
	}

	public void setTdiaryArticleService(TdiaryArticleService tdiaryArticleService) {
		this.tdiaryArticleService = tdiaryArticleService;
	}

	TdiaryArticleService tdiaryArticleService;
	
	
	public void remove(Object obj) throws SQLException {
		Tdiary tdiary = (Tdiary)obj;
		tdiaryDao.delete(obj);
		tdiarySubscribeService.removeByTdiarySeq(tdiary.getTdiarySeq());
		tdiaryArticleService.removeByTdiarySeq(tdiary.getTdiarySeq());
	}

	
	public Object get(Object obj) throws SQLException{
		Tdiary tdiary = (Tdiary) tdiaryDao.select(obj);
		return tdiaryArticleService.getListByTdiarySeq(tdiary.getTdiarySeq());
	}

	public Object create(Tdiary obj) throws SQLException {
		tdiaryDao.insert(obj);
		return null;
	}

	public void edit(Tdiary obj) throws SQLException {
		tdiaryDao.update(obj);
		
	}

	public List<Tdiary> getList(Object rp) throws SQLException {
		return tdiaryDao.list(rp);
	}

	public int getRowCount(Object rp) throws SQLException {
		return tdiaryDao.getRowCount(rp);
	}
	
	
	

}
