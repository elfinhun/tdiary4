package com.tdiary.web.diary.model;

import java.util.Date;

public class TdiaryArticleScrap {
	
	int tdiaryArticleScrapSeq;
	int tdiaryArticleSeq;
	int tdiaryArticleScrapUser;
	Date tdiaryArticleScrapDate;
	
	
	public int getTdiaryArticleSeq() {
		return tdiaryArticleSeq;
	}
	public void setTdiaryArticleSeq(int tdiaryArticleSeq) {
		this.tdiaryArticleSeq = tdiaryArticleSeq;
	}
	public int getTdiaryArticleScrapUser() {
		return tdiaryArticleScrapUser;
	}
	public void setTdiaryArticleScrapUser(int tdiaryArticleScrapUser) {
		this.tdiaryArticleScrapUser = tdiaryArticleScrapUser;
	}
	public Date getTdiaryArticleScrapDate() {
		return tdiaryArticleScrapDate;
	}
	public void setTdiaryArticleScrapDate(Date tdiaryArticleScrapDate) {
		this.tdiaryArticleScrapDate = tdiaryArticleScrapDate;
	}	
}
