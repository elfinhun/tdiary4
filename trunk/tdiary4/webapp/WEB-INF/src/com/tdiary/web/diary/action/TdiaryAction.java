package com.tdiary.web.diary.action;

import java.sql.SQLException;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.tdiary.web.diary.bo.TdiaryArticleService;
import com.tdiary.web.diary.bo.TdiaryArticleTagService;
import com.tdiary.web.diary.bo.TdiaryService;
import com.tdiary.web.diary.model.Tdiary;
import com.tdiary.web.diary.model.TdiaryArticle;
import com.tdiary.web.diary.model.TdiaryArticleTag;

public class TdiaryAction extends ActionSupport{
	public TdiaryArticleTag getTdiaryArticleTag() {
		return tdiaryArticleTag;
	}

	public void setTdiaryArticleTag(TdiaryArticleTag tdiaryArticleTag) {
		this.tdiaryArticleTag = tdiaryArticleTag;
	}

	public List<Tdiary> getList() {
		return list;
	}

	public void setList(List<Tdiary> list) {
		this.list = list;
	}

	public TdiaryService getTdiaryService() {
		return tdiaryService;
	}

	public void setTdiaryService(TdiaryService tdiaryService) {
		this.tdiaryService = tdiaryService;
	}

	public TdiaryArticleService getTdiaryArticleService() {
		return tdiaryArticleService;
	}

	public void setTdiaryArticleService(TdiaryArticleService tdiaryArticleService) {
		this.tdiaryArticleService = tdiaryArticleService;
	}

	public TdiaryArticleTagService getTdiaryArticleTagService() {
		return tdiaryArticleTagService;
	}

	public void setTdiaryArticleTagService(
			TdiaryArticleTagService tdiaryArticleTagService) {
		this.tdiaryArticleTagService = tdiaryArticleTagService;
	}

	public int getRowCount() {
		return rowCount;
	}

	public void setRowCount(int rowCount) {
		this.rowCount = rowCount;
	}

	public void setTdiary(Tdiary tdiary) {
		this.tdiary = tdiary;
	}

	public void setTdiaryArticle(TdiaryArticle tdiaryArticle) {
		this.tdiaryArticle = tdiaryArticle;
	}

	Tdiary tdiary;
	TdiaryArticle tdiaryArticle;
	TdiaryArticleTag tdiaryArticleTag;
	List<Tdiary> list;
	TdiaryService tdiaryService;
	TdiaryArticleService tdiaryArticleService;
	TdiaryArticleTagService tdiaryArticleTagService;
	int rowCount;
	
	public String getTdiaryList() throws SQLException{		
		list = tdiaryService.getList(null);
		rowCount = tdiaryService.getRowCount(null);
		return SUCCESS;
	}
	
	public String createTdiary() throws SQLException{
		tdiaryService.create(tdiary);
		return SUCCESS;
	}
	
	public String editTdiary() throws SQLException{
		tdiaryService.edit(tdiary);
		return SUCCESS;
	}
	
	public String removeTdiary() throws SQLException{
		tdiaryService.remove(tdiary);
		return SUCCESS;
	}
	
	public String getTdiary() throws SQLException{
		Object obj = null;
		tdiary = (Tdiary) tdiaryService.get(obj);
		return SUCCESS;
	}
	
	public String createTdiaryArticle() throws SQLException {
		tdiaryArticleService.create(tdiaryArticle);
		tdiaryArticleTagService.create(tdiaryArticleTag);
		return SUCCESS;
	}
	
	public String editTdiaryArticle() throws SQLException {
		tdiaryArticleService.edit(tdiaryArticle);
		//tdiaryArticleTagService.create(tdiaryArticleTag);
		//tdiaryArticleTagService.remove(null);
		return SUCCESS;
	}
	
	public String removeTdiaryArticle() throws SQLException {
		tdiaryArticleService.remove(tdiaryArticle);
		return SUCCESS;
	}
	
	public String getTdiaryArticle(){
		//tdiaryArticleService.get(obj);
		return SUCCESS;
	}
}


