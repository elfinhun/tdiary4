<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>userInfoView</title>
</head>
<body>			
	
	<table border="1">
		<tr>
			<td>
				user_seq
			</td>
			<td>
				<s:property value="userInfo.user_seq"/>
			</td>
			<td>
				user_id
			</td>	
			<td>
				<s:property value="userInfo.user_id"/>
			</td>
		</tr>
		<tr>
			<td>
				name
			</td>
			<td>
				<s:property value="userInfo.name"/>
			</td>
			<td>
				phone_no
			</td>
			<td>
				<s:property value="userInfo.phone_no"/>
			</td>
		</tr>
		
		
		<tr>
			<td>
				address
			</td>
			<td>
				<s:property value="userInfo.address"/>
			</td>
			<td>
				resident_no
			</td>	
			<td>
				<s:property value="userInfo.resident_no"/>
			</td>
		</tr>
		<tr>
			<td>
				job_code
			</td>
			<td>
				<s:property value="userInfo.job_code"/>
			</td>
			<td>
				sys_use_cd
			</td>
			<td>
				<s:property value="userInfo.sys_use_cd"/>
			</td>
		</tr>
		
		<tr>
			<td>
				create_dt
			</td>
			<td>
				<s:property value="userInfo.create_date"/>
			</td>
			<td>
				upd_dt
			</td>
			<td>
				<s:property value="userInfo.update_date"/>
			</td>
		</tr>
	</table>
	
	<table>
		<tr>
			<td>
				<s:form action="userInfoModifyForm" method="post">
					<s:hidden name="userInfo.user_seq"/>
					<s:submit value="modifytForm"/>
				</s:form>
			</td>
			<td>
				<s:form action="userInfoDel" method="post">
					<s:hidden name="userInfo.user_seq"/>
					<s:submit value="delete"/>
				</s:form>
			</td>
		</tr>
	</table>

</body>
</html>