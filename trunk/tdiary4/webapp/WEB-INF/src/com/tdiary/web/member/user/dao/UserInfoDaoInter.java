package com.tdiary.web.member.user.dao;

import java.util.List;

import com.tdiary.web.member.user.model.UserInfo;

public interface UserInfoDaoInter {
	
	public List selectList(UserInfo userInfo);
	public UserInfo selectObject(UserInfo userInfo);
	public int update(UserInfo userInfo);
	public int insert(UserInfo userInfo);
	public int delete(UserInfo userInfo);
	

}
