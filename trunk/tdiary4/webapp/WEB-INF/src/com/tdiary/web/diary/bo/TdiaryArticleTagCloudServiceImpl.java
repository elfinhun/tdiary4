package com.tdiary.web.diary.bo;

import java.sql.SQLException;
import java.util.List;

import com.tdiary.web.diary.dao.TdiaryArticleTagCloudDao;
import com.tdiary.web.diary.model.TdiaryArticleTag;
import com.tdiary.web.diary.model.TdiaryArticleTagCloud;

public class TdiaryArticleTagCloudServiceImpl  implements TdiaryArticleTagCloudService {
	TdiaryArticleTagCloudDao tdiaryArticleTagCloudDao;
	public void setTdiaryArticleTagCloudDao(
			TdiaryArticleTagCloudDao tdiaryArticleTagCloudDao) {
		this.tdiaryArticleTagCloudDao = tdiaryArticleTagCloudDao;
	}

	public void decreaseCount(int tdiaryArticleSeq) {
		// TODO Auto-generated method stub

	}

	public void increaseCount(TdiaryArticleTag obj) {
		// TODO Auto-generated method stub

	}

	public Object create(TdiaryArticleTagCloud obj) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void edit(TdiaryArticleTagCloud obj) throws SQLException {
		// TODO Auto-generated method stub

	}

	public Object get(Object obj) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public List<TdiaryArticleTagCloud> getList(Object rp) throws SQLException {
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
