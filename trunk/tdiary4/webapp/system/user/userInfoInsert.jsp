<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>userInfoInsert</title>

 <script src="/common/jquery/jquery-1.3.2.js"></script>
 
 <script src="../test.js"></script>
<script type="text/javascript">
	
	//test();

	
	
</script>

</head>
<body>
<table>
	<tr>
		<td>fffff</td>
		<td><input type="text" id="test"/></td>
	</tr>
</table>
	
<s:form action="userInfoInsert" method="post"  >	
				
			<s:textfield label="user_id" name="userInfo.user_id"  id="user_id"/>
			<s:password label="password" name="userInfo.password" />
			<s:textfield label="name" name="userInfo.name" />
			<s:textfield label="phone_no" name="userInfo.phone_no" />
			<s:textfield label="address" name="userInfo.address" />
			<s:textfield label="resident_no" name="userInfo.resident_no" />
			<s:textfield label="job_code" name="userInfo.job_code" />
			</br>					
			<s:submit value="insert" />
	
	
</s:form>	
	
</body>
</html>