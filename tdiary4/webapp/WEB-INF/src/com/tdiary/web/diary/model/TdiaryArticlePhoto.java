package com.tdiary.web.diary.model;

import java.math.BigDecimal;
import java.util.Date;

public class TdiaryArticlePhoto {
	
	int tdiaryPhotoArticleSeq;
	int tdiaryArticleSeq;
	String tdiaryPhotoPalceName;
	BigDecimal tdiaryPhotoLogitude;
	BigDecimal tdiaryPhotoLatitude;
	String tdiaryPhotoIntroduction;
	String tdiaryPhotoFile;
	String tdiaryPhotoFileServer;
	Date createDate;
	int createUser;
	Date updateDate;
	int updateUser;
	
	
	public int getTdiaryPhotoArticleSeq() {
		return tdiaryPhotoArticleSeq;
	}
	public void setTdiaryPhotoArticleSeq(int tdiaryPhotoArticleSeq) {
		this.tdiaryPhotoArticleSeq = tdiaryPhotoArticleSeq;
	}
	public int getTdiaryArticleSeq() {
		return tdiaryArticleSeq;
	}
	public void setTdiaryArticleSeq(int tdiaryArticleSeq) {
		this.tdiaryArticleSeq = tdiaryArticleSeq;
	}
	public String getTdiaryPhotoPalceName() {
		return tdiaryPhotoPalceName;
	}
	public void setTdiaryPhotoPalceName(String tdiaryPhotoPalceName) {
		this.tdiaryPhotoPalceName = tdiaryPhotoPalceName;
	}
	public BigDecimal getTdiaryPhotoLogitude() {
		return tdiaryPhotoLogitude;
	}
	public void setTdiaryPhotoLogitude(BigDecimal tdiaryPhotoLogitude) {
		this.tdiaryPhotoLogitude = tdiaryPhotoLogitude;
	}
	public BigDecimal getTdiaryPhotoLatitude() {
		return tdiaryPhotoLatitude;
	}
	public void setTdiaryPhotoLatitude(BigDecimal tdiaryPhotoLatitude) {
		this.tdiaryPhotoLatitude = tdiaryPhotoLatitude;
	}
	public String getTdiaryPhotoIntroduction() {
		return tdiaryPhotoIntroduction;
	}
	public void setTdiaryPhotoIntroduction(String tdiaryPhotoIntroduction) {
		this.tdiaryPhotoIntroduction = tdiaryPhotoIntroduction;
	}
	public String getTdiaryPhotoFile() {
		return tdiaryPhotoFile;
	}
	public void setTdiaryPhotoFile(String tdiaryPhotoFile) {
		this.tdiaryPhotoFile = tdiaryPhotoFile;
	}
	public String getTdiaryPhotoFileServer() {
		return tdiaryPhotoFileServer;
	}
	public void setTdiaryPhotoFileServer(String tdiaryPhotoFileServer) {
		this.tdiaryPhotoFileServer = tdiaryPhotoFileServer;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getCreateUser() {
		return createUser;
	}
	public void setCreateUser(int createUser) {
		this.createUser = createUser;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public int getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(int updateUser) {
		this.updateUser = updateUser;
	}
	
	
}
