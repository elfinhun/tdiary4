package com.tdiary.web.member.user.action;

import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.tdiary.web.member.user.bo.UserInfoServiceInter;
import com.tdiary.web.member.user.model.UserInfo;

public class UserInfoAction extends ActionSupport{
	
	public UserInfo userInfo;
	private UserInfoServiceInter userInfoService;
	private List list;
	
	
	/*--spring di setter --*/
	public void setUserInfoService(UserInfoServiceInter userInfoService) {
		this.userInfoService = userInfoService;
	}
	/* -- */	
	
	public String userInfoInsertForm(){
		
		return SUCCESS;
		
	}
	
	public String userInfoModifyForm(){		
		userInfo=userInfoService.selectUserInfo(userInfo);
		return SUCCESS;
		
	}
	
	
	public String userInfoList(){
		
		list = userInfoService.selectUserInofoList(userInfo);
		
		return SUCCESS;
	}
	
	public String userInfoView(){
		
		System.out.println("userInfo.getUser_seq()  "+userInfo.getUser_seq());		
		userInfo=userInfoService.selectUserInfo(userInfo);
		
		return SUCCESS;
	}
	
	public String userInfoInsert(){
		
		userInfoService.insertUserInfo(userInfo);
		System.out.println("------------------->"+userInfo.getUser_id());
		list = userInfoService.selectUserInofoList(userInfo);
		return SUCCESS;
	}
	
	public String userInfoModify(){
		
		userInfoService.updateUserInfo(userInfo);
		list = userInfoService.selectUserInofoList(userInfo);
		return SUCCESS;
	}
	
	public String userInfoDel(){
		
		userInfoService.deleteUserInfo(userInfo);
		list = userInfoService.selectUserInofoList(userInfo);
		return SUCCESS;
	}
	
	
	/*변수 get set   */

	public UserInfo getUserInfo() {
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public List getList() {
		return list;
	}

	public void setList(List list) {
		this.list = list;
	}
	
	
	

}
