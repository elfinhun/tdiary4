package com.tdiary.web.diary.model;

import java.util.Date;

public class Tdiary {
	
	public Tdiary() {
		super();
		
	}
	int tdiarySeq;
	String tdiaryTitle;
	String tdiaryIntroduction;
	String subscribeCode;
	String publishCode;
	Date createDate;
	int createUser;
	Date updateDate;
	int updateUser;

	
	public int getTdiarySeq() {
		return tdiarySeq;
	}
	public void setTdiarySeq(int tdiarySeq) {
		this.tdiarySeq = tdiarySeq;
	}
	public String getTdiaryTitle() {
		return tdiaryTitle;
	}
	public void setTdiaryTitle(String tdiaryTitle) {
		this.tdiaryTitle = tdiaryTitle;
	}
	public String getTdiaryIntroduction() {
		return tdiaryIntroduction;
	}
	public void setTdiaryIntroduction(String tdiaryIntroduction) {
		this.tdiaryIntroduction = tdiaryIntroduction;
	}
	public String getSubscribeCode() {
		return subscribeCode;
	}
	public void setSubscribeCode(String subscribeCode) {
		this.subscribeCode = subscribeCode;
	}
	public String getPublishCode() {
		return publishCode;
	}
	public void setPublishCode(String publishCode) {
		this.publishCode = publishCode;
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
