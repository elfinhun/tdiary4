package com.tdiary.web.member.user.bo;

import java.util.List;

import com.tdiary.web.member.user.model.UserInfo;

public interface UserInfoServiceInter {
	
	public List selectUserInofoList(UserInfo userInfo);
	public UserInfo selectUserInfo(UserInfo userInfo);
	public void insertUserInfo(UserInfo userInfo);
	public void updateUserInfo(UserInfo userInfo);
	public void deleteUserInfo(UserInfo userInfo);
	
	

}
