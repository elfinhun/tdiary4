<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>userInfoModify</title>
</head>
<body>
	<s:form action="userInfoModify" method="post">		
		<s:textfield label="user_seq" name="userInfo.user_seq" readonly="true"/> 		
	
		<s:textfield label="user_id" name="userInfo.user_id"/>
		
		<s:textfield label="password" name="userInfo.password"/>

		<s:textfield label="name" name="userInfo.name"/>

		<s:textfield label="phone_no" name="userInfo.phone_no"/>
		
		<s:textfield label="address" name="userInfo.address"/>				
	
		<s:textfield label="resident_no" name="userInfo.resident_no"/>

		<s:textfield label="job_code" name="userInfo.job_code"/>

		<s:textfield label="sys_use_cd" name="userInfo.sys_use_cd"/>	
		
		<s:textfield label="create_dt" name="userInfo.create_date"/>
	
		<s:textfield label="upd_dt" name="userInfo.update_date"/>
		</br>
		<s:submit value="modify"/>
		
	</s:form>	
	
	
	

</body>
</html>