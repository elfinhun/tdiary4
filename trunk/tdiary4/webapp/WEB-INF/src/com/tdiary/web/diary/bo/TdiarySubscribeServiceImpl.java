package com.tdiary.web.diary.bo;

import java.sql.SQLException;
import java.util.List;

import com.tdiary.web.diary.dao.TdiarySubscribeDao;
import com.tdiary.web.diary.model.TdiarySubscribe;

public class TdiarySubscribeServiceImpl  implements
		TdiarySubscribeService {

	TdiarySubscribeDao tdiarySubscribeDao ;
	
	public void setTdiarySubscribeDao(TdiarySubscribeDao tdiarySubscribeDao) {
		this.tdiarySubscribeDao = tdiarySubscribeDao;
	}

	public void removeByTdiarySeq(int tdiarySeq) {
		tdiarySubscribeDao.deleteByTdiarySeq(tdiarySeq);

	}

	public Object create(TdiarySubscribe obj) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void edit(TdiarySubscribe obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public Object get(Object obj) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TdiarySubscribe> getList(Object rp) throws SQLException {
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
