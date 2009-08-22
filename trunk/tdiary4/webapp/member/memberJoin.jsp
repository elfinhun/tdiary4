<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>memberJoin</title>

<SCRIPT type="text/javascript" src="/tdiary4/common/jquery/test.js" ></SCRIPT>
<SCRIPT type="text/javascript" src="/tdiary4/common/jquery/jquery-1.3.2.js" ></SCRIPT>

<SCRIPT type="text/javascript">
	//$(function(){		
	//});	
	
	jQuery(function($) {
		
		//$("td:parent"). css('background-color', '#bbbbff');
		$("#joinBtn").click(function(){
			if($('input[name=chkYn]').val()!='Y'){
				alert('id check!');
			}else if($('input[name=userInfo.password]').val()==''){
				alert('input password !');
			}else if($('input[name=userInfo.name]').val()==''){
				alert('input name !');
			}else if($('input[name=userInfo.phone_no]').val()==''){
				alert('input phone_no !');
			}else if($('input[name=userInfo.address]').val()==''){
				alert('input address !');
			}else{
			 	$('form[name=userInfoInsertForm]').submit();
			}
			
		});
		//var input = $("form input:text").css({background:"yellow", border:"3px red solid"});
		$("#id_check").click(function(){
			//alert($('input[name=userInfo.user_id]').val()); return;
			$.ajax({
				url: '/tdiary4/idCheck.action',
				data: {'userInfo.user_id': $('input[name=userInfo.user_id]').val()},
				type: 'post', 
				dataType: 'text', 
				beforeSend: function() {
					if($('input[name=userInfo.user_id]').val() == '') {
						alert('insert userId '); return false;
					}
				},
				error: function() {
					alert('Ajax failure');  
				},
				success: function(response) {
					//alert('status: '+response);
					if(response=='Y'){
						alert('등록가능한 ID 입니다.');
						$('input[name=chkYn]').val('Y');						
					}else{
						alert('사용중인  ID 입니다.');
						$('input[name=userInfo.user_id]').val('');
					}
				}
			});
			
		});		
		
		
	});
</SCRIPT>	

<script type="text/javascript">
	function vali(){
		test2();		
		return ;	
	}
</script>
<script> 
	
	
 </script>

</head>

<body>

<s:form name="userInfoInsertForm" action="userInfoInsert" method="post" theme="simple" >
	<s:hidden name="chkYn" id="chkYn"/>
	<table>
		<tr>
			<td>
				user_id
			</td>			
			<td>
				<s:textfield  name="userInfo.user_id"  id="userInfo.user_id" />
				<input type="button" value="id_check"  id="id_check"/>
			</td>
		</tr>
		<tr>
			<td>
				password
			</td>
			<td>
				<s:password  name="userInfo.password" id="userInfo.password" />
			</td>
		</tr>
		<tr>
			<td>
				name
			</td>
			<td>
				<s:textfield  name="userInfo.name" id="userInfo.name" />
			</td>
		</tr>
		<tr>	
			<td>
				phone_no
			</td>
			<td>
				<s:textfield name="userInfo.phone_no" id="userInfo.phone_no" />
			</td>
		</tr>
		<tr>	
			<td>
				address
			</td>
			<td>
				<s:textfield  name="userInfo.address" id="userInfo.address" />
			</td>
		</tr>
		<tr>	
			<td>
				resident_no
			</td>
			<td>
				<s:textfield  name="userInfo.job_code" id="userInfo.job_code" />	
			</td>
		</tr>
	</table>
	
</s:form>

<table  width="242">
	<tr>
		<td align="right"><input id="joinBtn" type="button" value="memberJoin" /></td>
	</tr>
</table>	


</body>
</html>