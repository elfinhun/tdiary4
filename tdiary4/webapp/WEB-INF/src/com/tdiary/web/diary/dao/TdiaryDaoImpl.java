package com.tdiary.web.diary.dao;

import java.sql.SQLException;
import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;


import com.tdiary.web.diary.model.Tdiary;

public class TdiaryDaoImpl extends SqlMapClientDaoSupport implements TdiaryDao {

	public void freePublish() {
		// TODO Auto-generated method stub
		
	}

	public void freeSubScribe() {
		// TODO Auto-generated method stub
		
	}

	public List<Tdiary> getLastList(int count) {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPublish() {
		// TODO Auto-generated method stub
		
	}

	public void setSubScribe() {
		// TODO Auto-generated method stub
		
	}

	public void delete(Object obj) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public int getRowCount(Object rp) throws SQLException {
		return (Integer)getSqlMapClientTemplate().queryForObject("getTdiaryRowCount");
	}

	public void insert(Tdiary obj) throws SQLException {
		getSqlMapClientTemplate().insert("insertTdiary", obj);		
	}

	@SuppressWarnings("unchecked")
	public List<Tdiary> list(Object rp) throws SQLException {
		return getSqlMapClientTemplate().queryForList("getTdiaryList");
	}

	public Object select(Object obj) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	public void update(Tdiary obj) throws SQLException {
		getSqlMapClientTemplate().update("updateTdiary", obj);
		
	}

	

}
