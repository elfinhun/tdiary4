package com.tdiary.web.diary.model;

public class TdiarySubscribe {
	
	int tdiarySubscribeSeq;
	int tdiarySeq;
	int publishUser;
	int subscribeUser;
	
	
	public int getTdiarySubscribeSeq() {
		return tdiarySubscribeSeq;
	}
	public void setTdiarySubscribeSeq(int tdiarySubscribeSeq) {
		this.tdiarySubscribeSeq = tdiarySubscribeSeq;
	}
	public int getTdiarySeq() {
		return tdiarySeq;
	}
	public void setTdiarySeq(int tdiarySeq) {
		this.tdiarySeq = tdiarySeq;
	}
	public int getPublishUser() {
		return publishUser;
	}
	public void setPublishUser(int publishUser) {
		this.publishUser = publishUser;
	}
	public int getSubscribeUser() {
		return subscribeUser;
	}
	public void setSubscribeUser(int subscribeUser) {
		this.subscribeUser = subscribeUser;
	}
}
