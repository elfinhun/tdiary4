<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>userInfoInsert</title>
</head>
<body>
	
<s:form action="userInfoInsert" method="post"  >	
	<table border="1" >
	<tr>
				
			<td><s:textfield label="user_id" name="userInfo.user_id" /></td>
			<td><s:password label="password" name="userInfo.password" /></td>
			<td><s:textfield label="name" name="userInfo.name" /></td>
			<td><s:textfield label="phone_no" name="userInfo.phone_no" /></td>
			<td><s:textfield label="address" name="userInfo.address" /></td>
			<td><s:textfield label="resident_no" name="userInfo.resident_no" /></td>
			<td><s:textfield label="job_code" name="userInfo.job_code" /></td>
						
		</tr>	
		<s:submit value="insert" />
		
	</table>
	</br>
	
</s:form>	
	
</body>
</html>