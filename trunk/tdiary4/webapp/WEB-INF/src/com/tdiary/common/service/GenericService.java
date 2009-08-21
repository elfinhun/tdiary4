package com.tdiary.common.service;

import java.sql.SQLException;
import java.util.List;

public interface GenericService<T> {
	public Object create(T obj) throws SQLException;	
	public Object get(Object obj) throws SQLException;
	public void edit(T obj) throws SQLException;
	public void remove(Object obj) throws SQLException;
	public int getRowCount(Object rp) throws SQLException;
	public List<T> getList(Object rp) throws SQLException;
}
