package com.tdiary.common.dao;

import java.sql.SQLException;
import java.util.List;

public interface GenericDao<T> {
	public void insert(T obj) throws SQLException;
	public Object select(Object obj) throws SQLException;
	public void update(T obj) throws SQLException;
	public void delete(Object obj) throws SQLException;
	public List<T> list(Object rp) throws SQLException;
	public int getRowCount(Object rp) throws SQLException;
}
