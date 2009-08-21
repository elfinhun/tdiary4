package com.tdiary.web.diary.dao;

import java.util.List;

import com.tdiary.common.dao.GenericDao;
import com.tdiary.web.diary.model.Tdiary;

public interface TdiaryDao extends GenericDao<Tdiary>{
	List<Tdiary> getLastList(int count);
	void setSubScribe();
	void freeSubScribe();
	void setPublish();
	void freePublish();
}
