package com.tdiary.web.diary.bo;


import java.sql.SQLException;
import java.util.List;

import com.tdiary.web.diary.dao.TdiaryArticleScrapDao;
import com.tdiary.web.diary.model.TdiaryArticleScrap;

public class TdiaryArticleScrapServiceImpl  implements
		TdiaryArticleScrapService {

	TdiaryArticleScrapDao tdiaryArticleScrapDao;
	
	public void setTdiaryArticleScrapDao(TdiaryArticleScrapDao tdiaryArticleScrapDao) {
		this.tdiaryArticleScrapDao = tdiaryArticleScrapDao;
	}

	public void removeByTdiaryArticleSeq(int tdiaryArticleSeq) {
		tdiaryArticleScrapDao.deleteByTdiaryArticleSeq(tdiaryArticleSeq);

	}

	public Object create(TdiaryArticleScrap obj) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void edit(TdiaryArticleScrap obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public Object get(Object obj) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TdiaryArticleScrap> getList(Object rp) throws SQLException {
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
