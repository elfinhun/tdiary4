package com.tdiary.web.member.user.bo;

import java.util.List;

import com.tdiary.web.member.user.dao.UserInfoDaoInter;
import com.tdiary.web.member.user.model.UserInfo;

public class UserInfoServiceImpl implements UserInfoServiceInter{
	
	private UserInfoDaoInter userInfoDao;
	
	
	
	public void setUserInfoDao(UserInfoDaoInter userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	@Override
	public List selectUserInofoList(UserInfo userInfo) {
		
		return userInfoDao.selectList(userInfo);
	}
	
	@Override
	public UserInfo selectUserInfo(UserInfo userInfo) {
		
		return userInfoDao.selectObject(userInfo);
	}
	
	@Override
	public void insertUserInfo(UserInfo userInfo) {
		
		int i=userInfoDao.insert(userInfo);
		
	}
	
	@Override
	public void updateUserInfo(UserInfo userInfo) {
		
		int i=userInfoDao.update(userInfo);
	}
	
	

}
