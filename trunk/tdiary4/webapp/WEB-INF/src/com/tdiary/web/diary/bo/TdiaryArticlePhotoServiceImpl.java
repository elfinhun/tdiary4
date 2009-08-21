package com.tdiary.web.diary.bo;

import java.sql.SQLException;
import java.util.List;


import com.tdiary.web.diary.dao.TdiaryArticleDao;
import com.tdiary.web.diary.dao.TdiaryArticlePhotoDao;
import com.tdiary.web.diary.model.TdiaryArticlePhoto;

public class TdiaryArticlePhotoServiceImpl implements TdiaryArticlePhotoService {

	TdiaryArticlePhotoDao tdiaryArticlePhotoDao;
	TdiaryArticleDao tdiaryArticleDao;
	
	public void setTdiaryArticlePhotoDao(TdiaryArticlePhotoDao tdiaryArticlePhotoDao) {
		this.tdiaryArticlePhotoDao = tdiaryArticlePhotoDao;
	}

	public void setTdiaryArticleDao(TdiaryArticleDao tdiaryArticleDao) {
		this.tdiaryArticleDao = tdiaryArticleDao;
	}

	public void removeByTdiaryArticleSeq(int tdiaryArticleSeq) {
		tdiaryArticlePhotoDao.deleteByTdiaryArticleSeq(tdiaryArticleSeq);
	}

	public Object create(TdiaryArticlePhoto obj) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void edit(TdiaryArticlePhoto obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public Object get(Object obj) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TdiaryArticlePhoto> getList(Object rp) throws SQLException {
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
