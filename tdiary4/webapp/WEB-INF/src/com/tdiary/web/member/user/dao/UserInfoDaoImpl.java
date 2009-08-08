package com.tdiary.web.member.user.dao;

import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import com.tdiary.web.member.user.model.UserInfo;

public class UserInfoDaoImpl implements UserInfoDaoInter{
	
	private SqlMapClientTemplate sqlMapClientTemplate;
			
	public void setSqlMapClientTemplate(SqlMapClientTemplate sqlMapClientTemplate) {
		this.sqlMapClientTemplate = sqlMapClientTemplate;
	}
	

	@Override
	public List selectList(UserInfo userInfo) {		
		
		return sqlMapClientTemplate.queryForList("userInfo.selectList", userInfo);
	}
	
	@Override
	public UserInfo selectObject(UserInfo userInfo) {
		
		return (UserInfo)sqlMapClientTemplate.queryForObject("userInfo.selectObject", userInfo);
	}
	
	@Override
	public int insert(UserInfo userInfo) {
		
		return sqlMapClientTemplate.update("userInfo.insert", userInfo);
	}
	@Override
	public int update(UserInfo userInfo) {
		
		return sqlMapClientTemplate.update("userInfo.update", userInfo);
	}
	
	@Override
	public int delete(UserInfo userInfo) {
		
		return sqlMapClientTemplate.delete("userInfo.delete", userInfo);
	}
	

}
