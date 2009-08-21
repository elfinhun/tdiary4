package com.tdiary.web.diary.bo;

import java.sql.SQLException;
import java.util.List;


import com.tdiary.web.diary.dao.TdiaryArticleDao;
import com.tdiary.web.diary.model.TdiaryArticle;
import com.tdiary.web.diary.model.TdiaryArticleTag;

public class TdiaryArticleServiceImpl implements TdiaryArticleService {

	TdiaryArticleDao tdiaryArticleDao;
	TdiaryArticlePhotoService tdiaryArticlePhotoService;
	public void setTdiaryArticleDao(TdiaryArticleDao tdiaryArticleDao) {
		this.tdiaryArticleDao = tdiaryArticleDao;
	}

	public void setTdiaryArticlePhotoService(
			TdiaryArticlePhotoService tdiaryArticlePhotoService) {
		this.tdiaryArticlePhotoService = tdiaryArticlePhotoService;
	}

	public void setTdiaryArticleScrapService(
			TdiaryArticleScrapService tdiaryArticleScrapService) {
		this.tdiaryArticleScrapService = tdiaryArticleScrapService;
	}

	public void setTdiaryArticleTagService(
			TdiaryArticleTagService tdiaryArticleTagService) {
		this.tdiaryArticleTagService = tdiaryArticleTagService;
	}

	TdiaryArticleScrapService tdiaryArticleScrapService;
	TdiaryArticleTagService tdiaryArticleTagService;
	
	@SuppressWarnings("unchecked")
	public void removeByTdiarySeq(int tdiarySeq) throws SQLException {
		List<TdiaryArticle> list = (List<TdiaryArticle>) tdiaryArticleDao.select(tdiarySeq);
		for (TdiaryArticle tdiaryArticle : list) {
			removeByTdiaryArticleSeq(tdiaryArticle.getTdiaryArticleSeq());
		}
	}

	public List<TdiaryArticle> getListByTdiarySeq(int tdiarySeq) {
		return tdiaryArticleDao.listByTdiarySeq(tdiarySeq);
	}
	
	
	public void remove(Object obj) throws SQLException{
		TdiaryArticle tdiaryArticle = (TdiaryArticle)obj;
		removeByTdiaryArticleSeq(tdiaryArticle.getTdiaryArticleSeq());
	}
	
	private void removeByTdiaryArticleSeq(int tdiaryArticleSeq) throws SQLException{
		tdiaryArticleDao.delete(tdiaryArticleSeq);
		tdiaryArticlePhotoService.removeByTdiaryArticleSeq(tdiaryArticleSeq);
		tdiaryArticleScrapService.removeByTdiaryArticleSeq(tdiaryArticleSeq);
		tdiaryArticleTagService.removeByTdiaryArticleSeq(tdiaryArticleSeq);
	}
	
	
	public Object get(Object obj) throws SQLException{
		List<TdiaryArticle> tdiaryArticleList;
		TdiaryArticle tdiaryArticle = (TdiaryArticle)obj;
		List<TdiaryArticleTag> tdiaryArticleTagList = tdiaryArticleTagService.getListByTdiaryArticleSeq(tdiaryArticle.getTdiaryArticleSeq());
		for (TdiaryArticleTag tdiaryArticleTag : tdiaryArticleTagList) {
			//tdiaryArticleDao.select(tdiaryArticleTag)
		}
		return null;
	}

	public Object create(TdiaryArticle obj) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void edit(TdiaryArticle obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public List<TdiaryArticle> getList(Object rp) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public int getRowCount(Object rp) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}
}
