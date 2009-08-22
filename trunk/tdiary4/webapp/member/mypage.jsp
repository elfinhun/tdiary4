<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>tdiaryInsert</title>

</head>
<body>

	
	<table border="1">
		<tr>
			<td>			
				num				
			</td>
			<td>			
				tdiary_title				
			</td>
			<td>			
				remark				
			</td>
			<td>			
				create_date				
			</td>		
		</tr>
		<s:iterator value="list" status="row">
		<tr>
			<td>			
				<s:property value="#row.count"/>					
			</td>
			<td>			
				<s:a href="#"><s:property value="tdiary_title"/></s:a> 				
			</td>
			<td>			
				<s:property value="remark"/>				
			</td>
			<td>			
				<s:property value="create_date"/>				
			</td>		 
		</tr>
		</s:iterator>
		
	</table>
		</br>
	<table border="1"> 
		<tr>
			<td>			
				subscriber				
			</td>		
		</tr>
		
		<tr>
			<td>			
				subscriber				
			</td>		
		</tr>
		
	</table>
	
	<s:url id="ta" action="tdiaryInsert" />
	<table>
		<tr>
			<td>
				<s:form action="tdiaryInsertForm" method="post"> 
					<s:submit value="insert"/> 
				</s:form>
				
			</td>
		</tr>
	</table>
		
	

	
</body>
</html>