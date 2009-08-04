<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>userInfoList</title>
	<script type="text/javascript">
		function userInfoview(user_seq){
		
			alert(user_seq);
		
		
		}
	
	</script>

</head>
<body>
	
	
	<table border="1" >
	<tr>
			<!-- <td>#row.index</td> -->
			<td>num</td>			
			<td>user_seq</td>			
			<td>user_id</td>
			<td>password</td>
			<td>name</td>
			<td>phone_no</td>
			<td>address	</td>
			<td>resident_no</td>
			<td>job_code"</td>
			<td>sys_use_cd</td>
			<td>create_dt</td>			
			<td>upd_dt</td>			
		</tr>
	<s:iterator value="list" status="row">
		<tr> 
			<!--<td><s:property value="#row.index"/></td> -->
			<s:url id="View" action="userInfoView"><s:param name="userInfo.user_seq"><s:property value="user_seq"/></s:param></s:url>
			<td>
			<a href="<s:url action="userInfoView"><s:param name="userInfo.user_seq"><s:property value="user_seq"/></s:param></s:url>"><s:property value="#row.count"/></a></td>			
			<td><s:a href="%{View}" ><s:property value="user_seq"/></s:a></td>			
			<td><s:a href="%{View}" ><s:property value="user_id"/></s:a></td>
			<td><s:property value="password"/></td>
			<td><s:property value="name"/></td>
			<td><s:property value="phone_no"/></td>
			<td><s:property value="address"/>	</td>
			<td><s:property value="resident_no"/></td>
			<td><s:property value="job_code"/></td>
			<td><s:property value="system_use_code"/></td>						
			<td><s:property value="create_date"/></td>
			<td><s:property value="list[#row.index].update_date"/></td>  
		</tr>
		
		
		
	</s:iterator>
	</br>
	<s:form action="userInfoInsertForm" method="post">
			<s:submit />
		</s:form>
		
		
	</table>
	
</body>
</html>